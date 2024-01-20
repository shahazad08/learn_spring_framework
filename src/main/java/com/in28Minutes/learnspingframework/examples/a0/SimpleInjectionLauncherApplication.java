package com.in28Minutes.learnspingframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration

@ComponentScan
public class SimpleInjectionLauncherApplication {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(SimpleInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);

    }

}
