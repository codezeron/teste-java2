package test.api.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
@Component
public class ForkifyClient {

    @Value("${forkify.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public ForkifyClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> searchRecipes(String query) {
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
