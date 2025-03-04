# Encurtador de URL

Este projeto é um encurtador de URL simples que permite aos usuários encurtar URLs longas para links mais curtos e fáceis de compartilhar.

## Funcionalidades

- Encurtar URLs longas
- Redirecionar URLs encurtadas para o destino original

## Endpoints

### Criar uma URL encurtada

- **URL:** `/api-shorten`
- **Método:** `POST`
- **Descrição:** Cria uma nova URL encurtada.
- **Corpo da Requisição:**
    ```json
    {
        "url": "https://exemplo.com/url-longa"
    }
    ```
- **Resposta de Sucesso:**
    ```json
    {
        "url": "http://xxx.com/abc123"
    }
    ```

### Redirecionar para a URL original

- **URL:** `/:shortUrl`
- **Método:** `GET`
- **Descrição:** Redireciona a URL encurtada para a URL original.
- **Parâmetros de URL:**
    - `shortUrl`: O código da URL encurtada.
