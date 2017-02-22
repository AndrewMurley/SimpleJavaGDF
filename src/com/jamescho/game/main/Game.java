package com.jamescho.game.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JPanel;
import com.jamescho.game.main.LoadState;
import com.jamescho.game.main.State;

@SuppressWarnings("serial");

/**
 * Created by cortman on 2/14/17.
 */
public class Game extends JPanel{
    private int gameWidth;
    private int gameHeight;
    private Image gameImage;
    private Thread gameThread;
    private volatile boolean running;
    private volatile State currentState;

    public Game(int gameWidth, int gameHeight)
    {
        this.gameWidth = gameWidth;
        this.gameHeight = gameHeight;
        setPreferredSize(new Dimension(gameWidth, gameHeight));
        setBackground(Color.black);
        setFocusable(true);
        requestFocus();
    }

    public void setCurrentState(State newState)
    {
        System.gc();
        newState.init();
        currentState = newState;
    }

    @Override
    public void addNotify()
    {
        super.addNotify();
        setCurrentState(new LoadState());
    }
}
