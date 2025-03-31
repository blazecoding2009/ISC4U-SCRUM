package packageScrum;

import java.awt.*;
import javax.swing.JFrame;


public class Main extends Canvas {

    public static void main(String[] args) {
    JFrame frame = new JFrame("Mars Rover");
    Canvas canvas = new Main();
    canvas.setSize(1000, 800);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);

    }

    public void paint(Graphics g) {
        Arms armOne = new Arms();
        Wheels wheel = new Wheels();
        Body body = new Body(200, 225, 200, g);
        
        body.addBody();
        
        armOne.addArm(200, 218, g);
        armOne.addArm(350, 218, g);
        armOne.addArm(500, 218, g);
        
        wheel.drawWheel(200, 400, 100, g);
        wheel.drawWheel(350, 400, 100, g);
        wheel.drawWheel(500, 400, 100, g);
    }
    
}   
        
