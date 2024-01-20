package com.in28Minutes.learnspingframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        //var context=SpringApplication.run(HelloWorldConfiguration.class);
        // 1. Launch Spring Context...
        var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        /*
        2. Configure the things     that we want spring to manage
        HelloWorldConfiguration - @Configuration
        name - @Bean
         */
        // 3. Reteriving the brans managed by Spring.
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person5Qualifier"));

      //  Arrays.stream(context.getBeanDefinitionNames().forEach(System.out::println));




    }


}
