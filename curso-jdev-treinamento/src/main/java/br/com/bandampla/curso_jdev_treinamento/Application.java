package br.com.bandampla.curso_jdev_treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Spring Boot application starter class
 */
//@EntityScan(basePackages = "br.com.bandampla_curso_jdev_treinamento.model")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); /* É a linha principal que roda o projeto Java Spring Boot*/
    }
}
