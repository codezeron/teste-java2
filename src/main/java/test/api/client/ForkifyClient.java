package test.api.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
/**
 * The {@code ForkifyClient} class is responsible for making HTTP requests to the Forkify API.
 * It uses the {@link RestTemplate} to send requests and handle responses.
 */
@Component
public class ForkifyClient {

    // The base URL of the Forkify API, injected from the application properties.
    @Value("${forkify.api.url}")
    private String apiUrl;

    // The {@link RestTemplate} used for making HTTP requests.
    private final RestTemplate restTemplate;

    /**
     * Constructs a {@code ForkifyClient} with the specified {@link RestTemplate}.
     *
     * @param restTemplate the {@link RestTemplate} to use for HTTP requests.
     */
    public ForkifyClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Searches for recipes by a given query string.
     *
     * @param query the search query string.
     * @return a {@link ResponseEntity} containing the JSON response from the Forkify API.
     */
    public ResponseEntity<String> searchRecipes(String query) {

        // Constructs the URL for the search endpoint with the query parameter.
        String url = String.format("%s/search?q=%s", apiUrl, query);
        try {
            // Faz a chamada para a API externa e obtém a resposta
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            // Retorna a resposta da API externa
            return response;

        } catch (Exception e) {
            // Adiciona detalhes do erro para facilitar a depuração
            //e.printStackTrace();  // Imprime o stack trace no console
            ResponseEntity<String> response = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }
}
