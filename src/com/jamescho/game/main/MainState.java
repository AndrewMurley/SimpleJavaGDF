package com.jamescho.game.main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.jamescho.game.main.Resources;
/**
 * Created by k0765065 on 2/22/2017.
 */
public class MainState extends State{

    @Override
    public void init(){
        System.out.println("Entered MenuState");
    }

    @Override
    public void update()
    {

    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(Resources.welcome, 0, 0, null);
    }


}
