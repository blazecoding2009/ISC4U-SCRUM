package packageScrum;

import java.awt.*;
import javax.swing.JFrame;


public class Main extends Canvas {

    public static void main(String[] args) {
    JFrame frame = new JFrame("My First Drawing!");
    Canvas canvas = new Main();
    canvas.setSize(1000, 800);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);

    }

    public void paint(Graphics g) {
        Arms armOne = new Arms();
        armOne.addArm(200, 218, g);
        armOne.addArm(350, 218, g);
        armOne.addArm(500, 218, g);
    }
    
}   
        
