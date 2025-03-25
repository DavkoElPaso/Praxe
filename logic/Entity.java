package org.example.logic;

import java.awt.Color;

public class Entity {
    public Coordinates coord;
    public int width;
    public int height;
    public Color color;

    public Entity(int x, int y, int width, int height, Color color) {
        this.coord = new Coordinates(x,y);
        this.width = width;
        this.height = height;
        this.color = color;
    }
}
