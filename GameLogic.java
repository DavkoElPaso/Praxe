package org.example;

import org.example.logic.*;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    final int MOVE_LENGHT=10;
    Ball ball;
    Background background;
    ArrayList<Enemy> enemies;

    public GameLogic() {

        background = new Background(0,0, "sosa.jpg");
        ball = new Ball(20, 20, "bomb_green.jpg");
        enemies = new ArrayList<>();
        Enemy enemy1 = new Enemy(150, 50, "bomb.jpg");
        Enemy enemy2 = new Enemy(150, 150, "bomb.jpg");
        Enemy enemy3 = new Enemy(250, 50, "bomb.jpg");
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies.add(enemy3);
    }
    public void update() {
        for (Enemy enemy : enemies) {
            int differenceX = Math.abs(enemy.coord.x - ball.coord.x);
            int differenceY = Math.abs(enemy.coord.y - ball.coord.y);
            if (differenceX > differenceY) {
                if (enemy.coord.x > ball.coord.x) {
                    enemy.move(MOVE_LENGHT, Direction.LEFT);
                } else {
                    enemy.move(MOVE_LENGHT, Direction.RIGHT);

                }
            } else {
                if (enemy.coord.y > ball.coord.y) {
                    enemy.move(MOVE_LENGHT, Direction.UP);
                } else {
                    enemy.move(MOVE_LENGHT, Direction.DOWN);
                }
            }
        }
    }




}
