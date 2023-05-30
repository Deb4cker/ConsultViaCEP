package com.br.challengeviacep.service;
import com.br.challengeviacep.entity.PostalCode;
import com.br.challengeviacep.entity.ErrorResponse;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@EnableCaching
public class PostalCodeService {
    private static final String URI = "https://viacep.com.br/ws/";

    @Cacheable("postalCodes")
    public PostalCode findPostalCode(String cep) {
        try {
            String url = URI + cep + "/json/";
            System.out.println("searching...");
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<PostalCode> response = restTemplate.getForEntity(url, PostalCode.class);

            if (response.getHeaders().getExpires() > 0) {
                return new PostalCode(
                        response.getBody().getCep(),
                        response.getBody().getLogradouro(),
                        response.getBody().getComplemento(),
                        response.getBody().getBairro(),
                        response.getBody().getLocalidade(),
                        response.getBody().getUf(),
                        response.getBody().getIbge(),
                        response.getBody().getGia(),
                        response.getBody().getDdd(),
                        response.getBody().getSiafi());
            }
            return new ErrorResponse(true);
        } catch (HttpClientErrorException | NullPointerException exception) {
            return null;
        }
    }
}
