package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado via Spring Initialzr
 * Os seguintes módulos foram selecionados
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenFeign
 * 
 * @author VenioFerreira1973
 *
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoApplication.class, args);
	}

}
