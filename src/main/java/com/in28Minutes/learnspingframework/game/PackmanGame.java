package com.in28Minutes.learnspingframework.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements  GamingConsole{
    @Override
    public void up() {
        System.out.print("Packman Up");
    }
    @Override
    public void down() {
        System.out.print("Packman Down");
    }

    @Override
    public void left() {
        System.out.print("Packman Left");
    }

    @Override
    public void right() {
        System.out.print("Packman Right");
    }
}
