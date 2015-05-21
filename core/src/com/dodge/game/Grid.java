package com.dodge.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;


/**
 * Created by Irfan Sharif on 5/18/2015.
 */
public class Grid {
    public Sprite image;
    public Rectangle bounds;

    public Grid() {
        image = Assets.grid;
        bounds = new Rectangle(Gdx.graphics.getWidth()/2 - 150,Gdx.graphics.getHeight()/2 - 150,300,300);
    }
}
