package com.in28Minutes.learnspingframework.examples.a1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusineesClass {

    Depedency1 depedency1;

    Depedency2 depedency2;

    public YourBusineesClass(Depedency1 depedency1, Depedency2 depedency2) {
        super();
        this.depedency1 = depedency1;
        this.depedency2 = depedency2;
    }



    public String toString() {
        return "Used" + depedency1+ "and " +depedency2;
    }

}

@Component
class Depedency1 {
}

@Component
class Depedency2 {
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);
        System.out.println(context.getBean(YourBusineesClass.class));

    }

}
