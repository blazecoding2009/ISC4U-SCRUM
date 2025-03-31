package packageScrum;

import java.awt.Color;
import java.awt.Graphics;
/**
 * This class draws the arms of the robot
 * @author Darren Su
 * @version March 30th 2025
 */
public class Arms {

    public void Arms(){
        
    }
    /**
     * This method draws the arms of the robot
     * pre: x and y are the coordinates of the robot
     * post: the arms of the robot are drawn
     * @param x x coordiate of the arm
     * @param y y coordiate of the arm
     * @param g graphics object to draw the arm
     */
    public void addArm(int x, int y, Graphics g){

        g.setColor(new Color(128, 128, 128)); 

        int xCoord[] = {49, 1, 47, 62, 77, 64, 75, 90, 98, 36, 90}; 
  
        int yCoord[] = {6, 63, 129, 153, 144, 129, 122, 135, 120, 70, 16}; 

        for (int i = 0; i < xCoord.length; i++) {
            xCoord[i] = xCoord[i] + x; 
        }

        for (int i = 0; i < yCoord.length; i++) {
            yCoord[i] = yCoord[i] + y; 
        }
        
        int numberofpoints = 11; 
  
        g.setColor(Color.gray); 

        g.drawPolygon(xCoord, yCoord, numberofpoints); 

        g.setColor(Color.gray); 
        g.fillPolygon(xCoord, yCoord, numberofpoints);
    }
    
}
