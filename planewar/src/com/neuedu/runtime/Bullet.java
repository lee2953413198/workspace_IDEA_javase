package com.neuedu.runtime;

import com.neuedu.base.BaseSpirit;
import com.neuedu.base.Draw;
import com.neuedu.base.Move;

import java.awt.*;

public class Bullet extends BaseSpirit implements Move, Draw {
    private  Image image;

    public Bullet() {
    }

    public Bullet(int x, int y, Image image) {
        super(x, y);
        this.image = image;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void move() {

    }
}
