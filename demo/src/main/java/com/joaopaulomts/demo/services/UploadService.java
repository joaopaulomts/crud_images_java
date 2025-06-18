package com.joaopaulomts.demo.services;

import java.io.InputStream;
import java.util.UUID;

import org.apache.tika.Tika;
import org.aspectj.weaver.reflect.ArgNameFinder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.RemoveObjectArgs;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UploadService {
    private final MinioClient minioClient;
    private final Tika tika;

    protected String upload(MultipartFile image) throws Exception {
        validateImage(image);
        String imageId = UUID.randomUUID().toString();

        minioClient.putObject(
            PutObjectArgs.builder()
                .bucket("images")
                .object(imageId)
                .stream(image.getInputStream(), image.getSize(), -1)
                .contentType(image.getContentType()).build()
        );

        return imageId;
    }

    protected String updateImage(String imageId, MultipartFile image) throws Exception {
        delete(imageId);
        String newImageId = upload(image);
        return newImageId;
    }

    protected void delete(String imageId) throws Exception {
        minioClient.removeObject(
            RemoveObjectArgs.builder()
                .bucket("images")
                .object(imageId)
                .build()
        );
    } 

    private void validateImage(MultipartFile image) throws Exception {
        if (image.getContentType().equals("null")) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Apenas Imagens!");
    
        try(InputStream inputStream = image.getInputStream()) {
            String mimeType = tika.detect(inputStream);

            if (!mimeType.startsWith("image/")) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Apenas Imagens!");
        } catch (Exception e) {
            if (e instanceof ResponseStatusException) {
                throw e;
            }
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Erro ao tratar a imagem!");
        }
    }
}
