/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vpprotype;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author irad_allen
 */
public class VideoPanel extends JPanel{
    
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;
    
    public VideoPanel(){
        super();
        
        setLayout(new BorderLayout());
        
        // Set up the video context
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        
        setPreferredSize(new Dimension(600,400));
        add(mediaPlayerComponent);
        
        setVisible(true);
 
    }
    
    public void startVideo(File file) {
        mediaPlayerComponent.mediaPlayer().media().play(file.toString());
    }
    
    public void play(){
        mediaPlayerComponent.mediaPlayer().controls().play();
    }
    
    //call methods on panel (cast to VideoPanel) from mainwindow when the control buttons are pressed
    public void pause(){
        mediaPlayerComponent.mediaPlayer().controls().pause();
    }
    
    public void forward(){
        mediaPlayerComponent.mediaPlayer().controls().skipTime(50);
    }
    
    public void backward(){
        mediaPlayerComponent.mediaPlayer().controls().skipTime(-50);
    }
    
    public void front(){
        mediaPlayerComponent.mediaPlayer().controls().setTime(0);
        pause();
    }
    
    public void end(){
        long end = mediaPlayerComponent.mediaPlayer().status().length();
        mediaPlayerComponent.mediaPlayer().controls().setTime(end - 1000);
        pause();
    }
}
