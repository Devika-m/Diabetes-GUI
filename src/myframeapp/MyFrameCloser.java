/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframeapp;

import java.awt.event.*;



/**
 *
 * @author 1414844
 */
public class MyFrameCloser extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    
}
