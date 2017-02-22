package com.jamescho.game.main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by k0765065 on 2/22/2017.
 */
public class LoadState extends State {

    @Override
    public void init()
    {
        Resources.load();
        System.out.println("Loaded Successfully");
    }

    @Override
    public void update()
    {

    }

    @Override
    public void render(Graphics g)
    {

    }

    @Override
    public void onClick(MouseEvent e)
    {

    }

    @Override
    public void onKeyPress(KeyEvent e)
    {

    }

    @Override
    public void onKeyRelease(KeyEvent e)
    {

    }
}
