package com.in28Minutes.learnspingframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MargioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario Up");
    }
    public void down() {
        System.out.println("Mario Down");
    }
    public void left() {
        System.out.println("Mario Left");
    }
    public void right() {
        System.out.println("Mario Right");
    }

}
