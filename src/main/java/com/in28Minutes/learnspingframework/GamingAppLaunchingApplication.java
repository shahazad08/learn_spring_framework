package com.in28Minutes.learnspingframework;

import com.in28Minutes.learnspingframework.game.GameRunner;
//import com.in28Minutes.learnspingframework.game.GamingConfiguration;
import com.in28Minutes.learnspingframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

@ComponentScan("com.in28Minutes.learnspingframework.game")
public class GamingAppLaunchingApplication {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(GamingAppLaunchingApplication.class);
       context.getBean(GamingConsole.class).up();
       context.getBean(GameRunner.class).run();

    }

}
