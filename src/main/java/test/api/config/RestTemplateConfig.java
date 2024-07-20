package test.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for RestTemplate.
 *
 * This class is annotated with @Configuration to indicate that it is a source of bean definitions.
 * It provides a bean definition for RestTemplate, which is used to make HTTP requests.
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Creates and returns a new RestTemplate instance.
     *
     * The @Bean annotation indicates that this method produces a bean to be managed by the Spring container.
     * RestTemplate is used for client-side HTTP access, facilitating communication with HTTP servers.
     *
     * @return a new instance of RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}