package ch.collen.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TodoRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoRestApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(TodoRestRepository todoRestRepository) {
        return args -> Stream.of(
                new Todo(1, "description1", "TODO Ana"),
                new Todo(2, "description2", "TODO Cyril")
        ).forEach(todoRestRepository::save);
    }

}
