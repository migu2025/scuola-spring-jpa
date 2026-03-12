package gm.scuolaJPA;

import gm.scuolaJPA.servizio.IUtenteServizio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScuolaJpaApplication implements CommandLineRunner {

@Autowired
private IUtenteServizio utenteServizio;

private static final Logger logger = LoggerFactory.getLogger(ScuolaJpaApplication.class);

	public static void main(String[] args) {
    logger.info("Iniciando la aplicacion");
		SpringApplication.run(ScuolaJpaApplication.class, args);
	logger.info("Aplicacion finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("*** Aplicacion ScuolaJpa ***");
	}
}
