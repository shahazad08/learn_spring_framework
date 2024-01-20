package com.in28Minutes.learnspingframework.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class BusinessService {
   private DataService dataService;
   @Autowired
    public void setDataService(DataService dataService) {
       System.out.println("Setter Injection Invoked!");
        this.dataService = dataService;
    }
    public DataService getDataService() {

        return dataService;
    }


}
@Component
class DataService {

}


@Configuration
@ComponentScan
@Component
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);

        System.out.println(context.getBean(BusinessService.class).getDataService());
    }

}
