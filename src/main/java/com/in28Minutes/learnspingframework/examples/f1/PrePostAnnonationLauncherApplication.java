package com.in28Minutes.learnspingframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class SomeClass {
    private SomeDepedency someDepedency;

    public SomeClass(SomeDepedency someDepedency) {
        super();
        this.someDepedency=someDepedency;
        System.out.println("All Depedencies are ready");
    }
@PostConstruct
    public void getInitialize() {
        someDepedency.getReady();
    }
@PreDestroy
    public void cleanUp() {
        System.out.println("CLean Up");
    }
}
@Component
class SomeDepedency {
    public void getReady(){
        System.out.println("Be Ready");
    }

}
@Configuration
@ComponentScan
public class PrePostAnnonationLauncherApplication {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(PrePostAnnonationLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);
    }

}
