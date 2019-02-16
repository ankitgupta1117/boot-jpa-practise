package com.ankit.bootpractise.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterRegistry;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.util.TypeUtils;

@Configuration
public class AppConfig {

    @Bean
    public ConversionService conversionService(){
        return new DefaultConversionService();
    }

    @Bean
    public BeanPostProcessor convertorPostProcessor(ConversionService conversionService){
        return new BeanPostProcessor(){
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                return bean;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                ConverterRegistry registry = (ConverterRegistry) conversionService;
                if(TypeUtils.isAssignable(Converter.class, bean.getClass())){
                    System.out.println("Bean Post Processor called after Initialization of bean "+beanName);
                    registry.addConverter((Converter)bean);
                }
                return bean;
            }
        };
    }

}
