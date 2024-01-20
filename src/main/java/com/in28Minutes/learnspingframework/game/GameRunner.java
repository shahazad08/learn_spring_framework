package com.in28Minutes.learnspingframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //MargioGame game;
    GamingConsole game;
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
        this.game=game;
    }
    public void run() {
        System.out.println("Run"+game);
        game.up();
        game.down();
        game.left();
        game.right();;
    }
}
