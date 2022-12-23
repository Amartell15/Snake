package sample;

import java.awt.*;

public class Snake {
    int x, y;
    int xspeed, yspeed;

    public Snake(){

        this.x = 0;
        this.y = 0;
        this.xspeed = 1;
        this.yspeed = 0;

    }
    public void Rectangle(){
    Rectangle rect = new Rectangle();
    }

    public void update() {
        this.x = this.x + this.xspeed;
        this.y = this.y + this.yspeed;

    }
    public void show(){
        //make a rectangle
        rect(this.x, this.y, 10, 10);
    }

}

