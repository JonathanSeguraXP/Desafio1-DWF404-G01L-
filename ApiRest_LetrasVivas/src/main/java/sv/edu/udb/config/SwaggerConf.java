package sv.edu.udb.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConf {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Letras Vivas API")
                        .version("1.0.0")
                        .description("API para gestión de libros")
                        .contact(new Contact()
                                .name("Equipo Letras Vivas")
                                .email("contacto@letrasvivas.com")));
    }
}