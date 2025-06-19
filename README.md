<!DOCTYPE html>
<html lang="pt-BR" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-Commerce Product CRUD API Showcase</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <!-- Chosen Palette: Cool Slate & Indigo -->
    <!-- Application Structure Plan: A single-page application with a top navigation bar for smooth scrolling between sections. The structure is designed to guide the user from a high-level overview to technical details. It begins with a hero section, followed by project features, a tech stack showcase, an interactive API explorer to dynamically display endpoint information, and finally a step-by-step guide for getting started. This non-linear, section-based approach is more user-friendly and engaging for exploring a technical project than a linear README file. -->
    <!-- Visualization & Content Choices: Instead of data charts, which are not relevant for this technical report, the key "visualizations" are: 1. A custom-styled project structure tree (HTML/CSS) to organize information. 2. An interactive API endpoint explorer (HTML/CSS/JS) that allows users to click and reveal details, making the technical specification explorable. 3. A clear, styled "Getting Started" guide with copyable code snippets (JS interaction). These choices directly translate the static report content into a more engaging and usable format. -->
    <!-- CONFIRMATION: NO SVG graphics used. NO Mermaid JS used. -->
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
        @import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap');
        .tech-card {
            transition: transform 0.2s ease-in-out, box-shadow 0.2s ease-in-out;
        }
        .tech-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 15px -3px rgb(0 0 0 / 0.1), 0 4px 6px -4px rgb(0 0 0 / 0.1);
        }
        .api-endpoint-btn.active {
            background-color: #4f46e5; /* indigo-600 */
            color: white;
            font-weight: 600;
        }
    </style>
</head>
<body class="bg-slate-50 text-slate-800">

    <!-- Header & Navigation -->
    <header class="bg-white/80 backdrop-blur-lg sticky top-0 z-50 shadow-sm">
        <nav class="container mx-auto px-6 py-4 flex justify-between items-center">
            <div class="text-xl font-bold text-indigo-600">🛍️ E-Commerce API</div>
            <div class="hidden md:flex space-x-8">
                <a href="#features" class="text-slate-600 hover:text-indigo-600 transition">Funcionalidades</a>
                <a href="#tech-stack" class="text-slate-600 hover:text-indigo-600 transition">Tecnologias</a>
                <a href="#api-explorer" class="text-slate-600 hover:text-indigo-600 transition">API Explorer</a>
                <a href="#getting-started" class="text-slate-600 hover:text-indigo-600 transition">Como Rodar</a>
            </div>
        </nav>
    </header>

    <main class="container mx-auto px-6 py-12">

        <!-- Hero Section -->
        <section id="hero" class="text-center py-20">
            <h1 class="text-4xl md:text-6xl font-extrabold text-slate-900 mb-4">E-Commerce Product CRUD API</h1>
            <p class="text-lg md:text-xl text-slate-600 max-w-3xl mx-auto">
                Uma API RESTful robusta e completa, construída com Spring Boot para gerenciar produtos de um e-commerce, incluindo upload e armazenamento de imagens com MinIO.
            </p>
        </section>

        <!-- Features Section -->
        <section id="features" class="py-16">
            <div class="text-center mb-12">
                <h2 class="text-3xl font-bold text-slate-900">✨ Funcionalidades Principais</h2>
                <p class="text-slate-600 mt-2">Tudo que você precisa para uma gestão de produtos completa.</p>
            </div>
            <div class="grid md:grid-cols-2 lg:grid-cols-3 gap-8">
                <div class="bg-white p-6 rounded-lg shadow-md tech-card">
                    <h3 class="font-semibold text-lg text-indigo-600 mb-2">CRUD Completo</h3>
                    <p class="text-slate-600">Crie, leia, atualize e delete produtos com endpoints intuitivos.</p>
                </div>
                <div class="bg-white p-6 rounded-lg shadow-md tech-card">
                    <h3 class="font-semibold text-lg text-indigo-600 mb-2">Upload de Imagens</h3>
                    <p class="text-slate-600">Armazenamento de imagens desacoplado e eficiente utilizando MinIO.</p>
                </div>
                <div class="bg-white p-6 rounded-lg shadow-md tech-card">
                    <h3 class="font-semibold text-lg text-indigo-600 mb-2">Validação de Dados</h3>
                    <p class="text-slate-600">Garante a integridade dos dados enviados para a API com Spring Validation.</p>
                </div>
                <div class="bg-white p-6 rounded-lg shadow-md tech-card">
                    <h3 class="font-semibold text-lg text-indigo-600 mb-2">Paginação</h3>
                    <p class="text-slate-600">A listagem de produtos é paginada para melhor performance.</p>
                </div>
                <div class="bg-white p-6 rounded-lg shadow-md tech-card">
                    <h3 class="font-semibold text-lg text-indigo-600 mb-2">Banco em Memória</h3>
                    <p class="text-slate-600">Utiliza H2 para agilidade e facilidade nos testes e desenvolvimento.</p>
                </div>
                 <div class="bg-white p-6 rounded-lg shadow-md tech-card">
                    <h3 class="font-semibold text-lg text-indigo-600 mb-2">Validação de Arquivos</h3>
                    <p class="text-slate-600">Usa Apache Tika para garantir que apenas imagens sejam enviadas.</p>
                </div>
            </div>
        </section>

        <!-- Tech Stack Section -->
        <section id="tech-stack" class="py-16 bg-slate-100 -mx-6 px-6">
            <div class="text-center mb-12">
                <h2 class="text-3xl font-bold text-slate-900">🚀 Tecnologias Utilizadas</h2>
                <p class="text-slate-600 mt-2">Construído com um conjunto de ferramentas modernas e eficientes.</p>
            </div>
            <div class="max-w-4xl mx-auto grid grid-cols-2 md:grid-cols-4 gap-8 text-center">
                <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">🌱</div>
                    <span class="font-semibold">Spring Boot</span>
                </div>
                <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">🗃️</div>
                    <span class="font-semibold">Spring Data JPA</span>
                </div>
                <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">🐳</div>
                    <span class="font-semibold">Docker</span>
                </div>
                <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">📦</div>
                    <span class="font-semibold">MinIO</span>
                </div>
                <div class="flex flex-col items-center">
                     <div class="bg-white p-4 rounded-full shadow-md mb-2">📄</div>
                    <span class="font-semibold">MapStruct</span>
                </div>
                <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">🧩</div>
                    <span class="font-semibold">Lombok</span>
                </div>
                 <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">🔍</div>
                    <span class="font-semibold">Apache Tika</span>
                </div>
                 <div class="flex flex-col items-center">
                    <div class="bg-white p-4 rounded-full shadow-md mb-2">💾</div>
                    <span class="font-semibold">H2 Database</span>
                </div>
            </div>
        </section>
        
        <!-- API Explorer Section -->
        <section id="api-explorer" class="py-16">
            <div class="text-center mb-12">
                <h2 class="text-3xl font-bold text-slate-900">⚙️ API Explorer Interativo</h2>
                <p class="text-slate-600 mt-2">Clique em um endpoint para ver os detalhes e exemplos de requisição.</p>
            </div>
            <div class="flex flex-col md:flex-row gap-8">
                <div class="w-full md:w-1/3">
                    <div id="api-buttons" class="flex flex-col space-y-2">
                        <button data-endpoint="post" class="api-endpoint-btn text-left p-3 rounded-lg bg-white shadow-sm hover:bg-slate-100 transition active">
                            <span class="bg-green-100 text-green-800 text-xs font-bold mr-2 px-2.5 py-0.5 rounded">POST</span> /products
                        </button>
                        <button data-endpoint="get-all" class="api-endpoint-btn text-left p-3 rounded-lg bg-white shadow-sm hover:bg-slate-100 transition">
                            <span class="bg-blue-100 text-blue-800 text-xs font-bold mr-2 px-2.5 py-0.5 rounded">GET</span> /products
                        </button>
                        <button data-endpoint="get-one" class="api-endpoint-btn text-left p-3 rounded-lg bg-white shadow-sm hover:bg-slate-100 transition">
                            <span class="bg-blue-100 text-blue-800 text-xs font-bold mr-2 px-2.5 py-0.5 rounded">GET</span> /products/{id}
                        </button>
                        <button data-endpoint="put" class="api-endpoint-btn text-left p-3 rounded-lg bg-white shadow-sm hover:bg-slate-100 transition">
                            <span class="bg-yellow-100 text-yellow-800 text-xs font-bold mr-2 px-2.5 py-0.5 rounded">PUT</span> /products/{id}
                        </button>
                        <button data-endpoint="delete" class="api-endpoint-btn text-left p-3 rounded-lg bg-white shadow-sm hover:bg-slate-100 transition">
                           <span class="bg-red-100 text-red-800 text-xs font-bold mr-2 px-2.5 py-0.5 rounded">DELETE</span> /products/{id}
                        </button>
                    </div>
                </div>
                <div class="w-full md:w-2/3 bg-white p-6 rounded-lg shadow-md min-h-[300px]">
                    <div id="api-details">
                        <!-- Content will be injected by JS -->
                    </div>
                </div>
            </div>
        </section>

        <!-- Getting Started Section -->
        <section id="getting-started" class="py-16">
            <div class="text-center mb-12">
                <h2 class="text-3xl font-bold text-slate-900">🏁 Como Rodar o Projeto</h2>
                <p class="text-slate-600 mt-2">Siga os passos abaixo para ter a aplicação rodando localmente.</p>
            </div>

            <div class="max-w-4xl mx-auto space-y-8">
                <div>
                    <h3 class="text-xl font-semibold mb-2"><span class="bg-indigo-100 text-indigo-600 rounded-full h-8 w-8 inline-flex items-center justify-center mr-2">1</span> Clone o Repositório</h3>
                    <div class="code-block bg-slate-800 text-white p-4 rounded-lg relative">
                        <button class="copy-btn absolute top-2 right-2 bg-slate-600 hover:bg-slate-500 text-xs p-1 rounded">Copiar</button>
                        <pre><code>git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio</code></pre>
                    </div>
                </div>

                <div>
                    <h3 class="text-xl font-semibold mb-2"><span class="bg-indigo-100 text-indigo-600 rounded-full h-8 w-8 inline-flex items-center justify-center mr-2">2</span> Inicie o Servidor MinIO</h3>
                    <p class="text-slate-600 mb-2">Use o Docker Compose para iniciar o container do MinIO.</p>
                    <div class="code-block bg-slate-800 text-white p-4 rounded-lg relative">
                        <button class="copy-btn absolute top-2 right-2 bg-slate-600 hover:bg-slate-500 text-xs p-1 rounded">Copiar</button>
                        <pre><code>docker-compose up -d</code></pre>
                    </div>
                    <p class="mt-4 p-4 bg-yellow-100 text-yellow-800 rounded-lg text-sm">
                        ⚠️ **Importante:** Acesse o console do MinIO em <a href="http://localhost:9001" target="_blank" class="font-bold underline">http://localhost:9001</a> (credenciais: `ROOTUSER` / `CHANGEME123`) e **crie um bucket chamado `images`** para que a aplicação funcione.
                    </p>
                </div>

                <div>
                    <h3 class="text-xl font-semibold mb-2"><span class="bg-indigo-100 text-indigo-600 rounded-full h-8 w-8 inline-flex items-center justify-center mr-2">3</span> Execute a Aplicação</h3>
                     <p class="text-slate-600 mb-2">Use o Maven para iniciar o servidor Spring Boot.</p>
                    <div class="code-block bg-slate-800 text-white p-4 rounded-lg relative">
                        <button class="copy-btn absolute top-2 right-2 bg-slate-600 hover:bg-slate-500 text-xs p-1 rounded">Copiar</button>
                        <pre><code>./mvnw spring-boot:run</code></pre>
                    </div>
                     <p class="mt-4 p-4 bg-green-100 text-green-800 rounded-lg text-sm">
                        🎉 Pronto! A API estará disponível em <a href="http://localhost:8080" target="_blank" class="font-bold underline">http://localhost:8080</a>.
                    </p>
                </div>
            </div>
        </section>

    </main>
    
    <footer class="bg-slate-800 text-slate-300 py-6 text-center">
        <p>Feito com ❤️ por João Paulo.</p>
    </footer>

    <script>
        document.addEventListener('DOMContentLoaded', () => {

            const apiDetailsContainer = document.getElementById('api-details');
            const apiButtonsContainer = document.getElementById('api-buttons');
            const apiButtons = apiButtonsContainer.querySelectorAll('.api-endpoint-btn');

            const apiContent = {
                post: {
                    title: 'POST /products',
                    description: 'Cria um novo produto no catálogo.',
                    body: `O corpo da requisição deve ser do tipo <strong>multipart/form-data</strong> com os seguintes campos:
                    <ul class="list-disc list-inside mt-2 text-slate-600">
                        <li><code class="bg-slate-100 p-1 rounded">name</code> (String): Nome do produto.</li>
                        <li><code class="bg-slate-100 p-1 rounded">price</code> (BigDecimal): Preço do produto.</li>
                        <li><code class="bg-slate-100 p-1 rounded">image</code> (File): O arquivo de imagem do produto.</li>
                    </ul>`,
                    curl: `curl --location 'http://localhost:8080/products' \\
--form 'name="Notebook Gamer"' \\
--form 'price="7500.00"' \\
--form 'image=@"./exemplo.png"'`
                },
                'get-all': {
                    title: 'GET /products',
                    description: 'Retorna uma lista paginada de todos os produtos cadastrados.',
                    body: 'Não é necessário enviar corpo na requisição. Parâmetros de paginação como `?page=0&size=10` podem ser usados.',
                    curl: `curl --location 'http://localhost:8080/products?page=0&size=5'`
                },
                'get-one': {
                    title: 'GET /products/{id}',
                    description: 'Busca e retorna um produto específico pelo seu UUID.',
                    body: 'Não é necessário enviar corpo na requisição. O ID deve ser passado na URL.',
                    curl: `curl --location 'http://localhost:8080/products/seu-uuid-aqui'`
                },
                put: {
                    title: 'PUT /products/{id}',
                    description: 'Atualiza os dados de um produto existente, incluindo nome, preço e a imagem.',
                    body: `O corpo da requisição deve ser do tipo <strong>multipart/form-data</strong> com os campos que deseja atualizar. O ID do produto deve ser passado na URL.`,
                    curl: `curl --location --request PUT 'http://localhost:8080/products/seu-uuid-aqui' \\
--form 'name="Notebook Gamer Pro"' \\
--form 'price="8500.00"' \\
--form 'image=@"./nova-imagem.png"'`
                },
                delete: {
                    title: 'DELETE /products/{id}',
                    description: 'Remove um produto do catálogo e sua imagem associada do MinIO.',
                    body: 'Não é necessário enviar corpo na requisição. O ID do produto a ser deletado deve ser passado na URL.',
                    curl: `curl --location --request DELETE 'http://localhost:8080/products/seu-uuid-aqui'`
                }
            };

            function updateDetails(endpoint) {
                const content = apiContent[endpoint];
                if (!content) return;

                apiDetailsContainer.innerHTML = `
                    <h3 class="text-xl font-bold text-slate-900 mb-2">${content.title}</h3>
                    <p class="text-slate-600 mb-4">${content.description}</p>
                    <h4 class="font-semibold text-slate-800 mb-2">Corpo da Requisição (Body)</h4>
                    <div class="text-slate-600 mb-6">${content.body}</div>
                    <h4 class="font-semibold text-slate-800 mb-2">Exemplo com cURL</h4>
                    <div class="code-block bg-slate-800 text-white p-4 rounded-lg relative">
                        <button class="copy-btn absolute top-2 right-2 bg-slate-600 hover:bg-slate-500 text-xs p-1 rounded">Copiar</button>
                        <pre><code>${content.curl}</code></pre>
                    </div>
                `;
                addCopyListeners();
            }

            apiButtonsContainer.addEventListener('click', (e) => {
                const button = e.target.closest('.api-endpoint-btn');
                if (!button) return;

                apiButtons.forEach(btn => btn.classList.remove('active'));
                button.classList.add('active');

                const endpoint = button.dataset.endpoint;
                updateDetails(endpoint);
            });
            
            function addCopyListeners() {
                document.querySelectorAll('.copy-btn').forEach(button => {
                    button.addEventListener('click', (event) => {
                        const pre = event.target.nextElementSibling;
                        const code = pre.querySelector('code').innerText;
                        
                        const el = document.createElement('textarea');
                        el.value = code;
                        document.body.appendChild(el);
                        el.select();
                        try {
                            document.execCommand('copy');
                            event.target.innerText = 'Copiado!';
                            setTimeout(() => {
                                event.target.innerText = 'Copiar';
                            }, 2000);
                        } catch (err) {
                            console.error('Falha ao copiar', err);
                            event.target.innerText = 'Erro!';
                        }
                        document.body.removeChild(el);
                    });
                });
            }

            // Initial state
            updateDetails('post');
            addCopyListeners(); // For the static ones in getting started
        });
    </script>
</body>
</html>
