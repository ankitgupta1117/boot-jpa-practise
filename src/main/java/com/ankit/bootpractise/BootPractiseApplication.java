package com.ankit.bootpractise;

import com.ankit.bootpractise.data.entities.ProductEntity;
import com.ankit.bootpractise.modals.ProductDTO;
import com.ankit.bootpractise.services.UserService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class BootPractiseApplication {

	public static void main(String[] args) throws IllegalAccessException {

		ApplicationContext c = SpringApplication.run(BootPractiseApplication.class, args);
        UserService service  = c.getBean(UserService.class);
        service.changeName("Ankit Gupta");

        /*ConversionService conversionService = c.getBean(ConversionService.class);
        ProductDTO product = new ProductDTO("12", "testProduct");
        ProductEntity e = conversionService.convert(product, ProductEntity.class );
        System.out.println(e);*/
    }

}

