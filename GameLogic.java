package org.example;

import org.example.logic.*;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    Ball ball;
    ArrayList<Enemy> enemies;

    public GameLogic() {


        ball = new Ball(920,650,50,50, Color.RED);
        enemies = new ArrayList<>();
        Enemy enemy1 = new Enemy(50,50,40,40,Color.ORANGE);
        enemies.add(enemy1);

    }

}
