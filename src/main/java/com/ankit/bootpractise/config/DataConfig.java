package com.ankit.bootpractise.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DataConfig {
/*
    PlatformTransactionManager transactionManager(){
        return new H2();
    }*/
}
