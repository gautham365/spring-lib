package com.pes1ug20cs152.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableJpaRepositories("my.package.base.*")
@ComponentScan(basePackages = { "my.package.base.*" })
@EntityScan("my.package.base.*")   
@SpringBootApplication
// @ComponentScan(basePackages = { "com.pes1ug20cs152.library.Controller", "com.pes1ug20cs152.library.Service", "com.pes1ug20cs152.library.Model.Book", "com.pes1ug20cs152.library.Repository" })
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }
}