package cl.magno.labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Inicio del Servicio
 * @author  Juan Francisco
 */
@SpringBootApplication
@EnableSwagger2

@EntityScan(basePackages = { "cl.magno.labs.games.secretfriend.core.model" })
@EnableJpaRepositories(basePackages = { "cl.magno.labs.games.secretfriend.core.dao" })
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
