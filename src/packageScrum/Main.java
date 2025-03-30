package packageScrum;

import java.awt.*;
import javax.swing.JFrame;

public class Main {
    public class Drawing extends Canvas {

        public static void main(String[] args) {
        JFrame frame = new JFrame("My First Drawing!");
        Canvas canvas = new Drawing();
        canvas.setSize(1000, 800);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        }

    }   

    public void paint(Graphics g) {
        Arms armOne = new Arms();
        armOne.addArm(233, 218, g);
    }
        
}
