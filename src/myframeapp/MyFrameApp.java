package myframeapp;
import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
* A more compact frame that includes a main method.
*/
public class MyFrameApp extends JFrame implements java.awt.event.WindowListener
{
/**
* The default constructor for MyFrame with no customisation.
*/
public MyFrameApp()
{
    this.addWindowListener(this);
// you can call super() here if you want
// but it is done implicitly
} //end constructor

/**
* Create a MyFrameApp with the given size and title.
*
* @param width	The width of the frame.
* @param height	The height of the frame.
* @param title	The title of the frame.
*/
public MyFrameApp(int width,int height,String title)
{
    this.addWindowListener(this);
    this.setSize(width,height);	//set frame size
    this.setTitle(title);		//set frame title
} //end constructor

/**
* Override the paint method.
*/
@Override
public void paint(Graphics g)
{
    super.paint(g);
    g.drawString("Hello World",50,50);
} //end method paint

public void windowActivated(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowClosing(WindowEvent e)
{
    System.exit(0);
}
public void windowDeactivated(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowOpened(WindowEvent e){}

/**
* The main method of execution.
     * @param argv
*/
public static void main(String argv[])
{
MyFrameApp f=new MyFrameApp(400,400,"MyFrameApp");	//create a frame object and display it
f.setVisible(true);
} //end method main
} //end class MyFrameApp