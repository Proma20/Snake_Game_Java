package com.snake.game.entities;

import java.awt.Color;
import java.awt.Graphics;


public class SpecialApple {
    public Color[] arr = {Color.blue, Color.yellow, Color.magenta, Color.orange, Color.cyan, Color.gray, Color.pink, Color.white, Color.red, Color.green} ;
    
    private int xCoor, yCoor, width, height;
    public SpecialApple(int xCoor ,int yCoor,int tileSize)
    {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    } 
    public void tick(){
        
    }
    public void draw(Graphics g, int x){
        g.setColor(arr[x]);
        //g.drawOval(xCoor*width, yCoor*height, width, height);
        
        
        g.setColor(arr[x]);
        
       
       g.fillRect(xCoor*width, yCoor*height, width, height);
        //g.fillOval(xCoor*width, yCoor*height, width, height);
       
        
    }

    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }
    
}
