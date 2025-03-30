package packageScrum;

import java.awt.Color;
import java.awt.Graphics;

public class Arms {

    public void Arms(){
        
    }

    public void addArm(int x, int y, Graphics g){

        g.setColor(new Color(128, 128, 128)); 

        int xCoord[] = {49, 1, 47, 62, 77, 64, 75, 90, 98, 36, 90}; 
  
        int yCoord[] = {6, 63, 129, 153, 144, 129, 122, 135, 120, 70, 16}; 

        for (int a : xCoord) {
            a = a + x;
        }

        for (int b : yCoord) {
            b = b + y;
        }
  
        int numberofpoints = 11; 
  
        g.setColor(Color.gray); 
        g.drawPolygon(xCoord, yCoord, numberofpoints); 
    }
    
}
