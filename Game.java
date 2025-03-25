package org.example;

import org.example.logic.Coordinates;
import org.example.logic.Direction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
                    logic.ball.move(10,Direction.LEFT);
                    graphics.render(logic);
                }
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    logic.ball.move(10,Direction.RIGHT);
                    graphics.render(logic);
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    logic.ball.move(10,Direction.UP);
                    graphics.render(logic);
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    logic.ball.move(10,Direction.DOWN);
                    graphics.render(logic);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Timer timer =new Timer(300, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logic.update();
                graphics.render(logic);
            }

        });
        timer.start();



        graphics.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Rectangle pointOfCollision = new Rectangle(e.getX(), e.getY()-30, 1,1);
                Rectangle ballPosition = logic.ball.getEntityRectangle();


                if (pointOfCollision.intersects(ballPosition)){
                    logic.ball.move(100, Direction.RIGHT);
                    graphics.render(logic);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        new Game();
    }
}
