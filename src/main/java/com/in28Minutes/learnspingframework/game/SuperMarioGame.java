package com.in28Minutes.learnspingframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperMarioGame implements GamingConsole {
    public void up() {
        System.out.println("Contra Up");
    }
    public void down() {
        System.out.println("Contra Down");
    }
    public void left() {
        System.out.println("Contra Left");
    }
    public void right() {
        System.out.println("Contra Right");
    }
}
