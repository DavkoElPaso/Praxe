package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game {
    GameLogic logic;

    public Game() {
        logic = new GameLogic();
        GameGraphics graphics = new GameGraphics(logic);
        graphics.render(logic);


        graphics.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    logic.ball.coord.x--;
                    graphics.render(logic);
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    logic.ball.coord.y--;
                    graphics.render(logic);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }



        });


    }

    public static void main(String[] args) {
        new Game();
    }
}
