/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingbasicshapes;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author AcriCAA
 */
public class DrawingBasicShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a MyJPanel object
        MyCanvas panel = new MyCanvas();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Using Common Graphics Class Methods");
        frame.setSize(700,431);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas to the frame as a content pane
        frame.add(panel);
        frame.setVisible(true);
    }
    
}

class MyCanvas extends Canvas
{

    public MyCanvas(){
     
    }
    
    public void paint (Graphics graphics){
    
         // add a logo to the canvas
        Image logo = new ImageIcon("photo.png").getImage();
        graphics.drawImage(logo, 390, 440, null);
    
    } // end overriden paint method
}
