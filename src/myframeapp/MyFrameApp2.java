/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframeapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author 1414844
 */
public class MyFrameApp2 extends JFrame
{
    public MyFrameApp2()
    {
        super();
        this.addWindowListener(new MyFrameCloser());
    }
    
    public MyFrameApp2(int width, int height, String title)
    {
        this.addWindowListener(new MyFrameCloser());
        
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
    }
    
    public static void main(String argv[])
    {
        MyFrameApp2 f = new MyFrameApp2(400, 400, "MyFrameApp Version 2");
        f.setVisible(true);
        
        //nlgfgfdgfg
    }
    
            
    
}
