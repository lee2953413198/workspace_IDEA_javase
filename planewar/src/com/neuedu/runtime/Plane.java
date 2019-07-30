package com.neuedu.runtime;

import com.neuedu.base.BaseSpirit;
import com.neuedu.base.Draw;
import com.neuedu.base.Move;
import com.neuedu.until.ImageMap;

import java.awt.*;

public class Plane extends BaseSpirit implements Move, Draw {
    private Image image;

    public Plane() {
        this(0,0, ImageMap.get("my01"));

    }

    public Plane(int x, int y, Image image) {
        super(x, y);
        this.image = image;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(image,getX(),getY(),image.getWidth(null),image.getHeight(null),null);

    }

    @Override
    public void move() {

    }
}
