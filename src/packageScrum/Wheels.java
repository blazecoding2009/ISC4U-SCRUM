package packageScrum;

import java.awt.Color;
import java.awt.Graphics;

public class Wheels {
	
	public Wheels() {
		
	}
	
	/**
	 * This method draws the wheels of the robot
	 * @param x x coordinate of the wheel
	 * @param y y coordinate of the wheel
	 * @param size size of the wheel
	 * @param g graphics object to draw the wheel
	 */
    public void drawWheel(int x, int y, int size, Graphics g) {
    	g.setColor(new Color(80, 80, 80)); // grey
        g.fillOval(x, y, size, size);
        
        g.setColor(new Color(60, 60, 60)); // even darker gray
        int cx = x + size / 2;
        int cy = y + size / 2;
        int radius = size / 2;

        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30); // 12 treads, 30 degrees apart
            int tx = (int) (cx + Math.cos(angle) * radius * 0.85);
            int ty = (int) (cy + Math.sin(angle) * radius * 0.85);
            g.fillRect(tx - 2, ty - 2, 4, 4); // Small square treads
        }
        
        g.setColor(new Color(120, 120, 120)); // lighter metal
        int hubSize = size / 3;
        g.fillOval(cx - hubSize / 2, cy - hubSize / 2, hubSize, hubSize);
        
        // wheel spokes
        g.setColor(new Color(150, 150, 150));
        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(i * 60); // 6 spokes
            int ex = (int) (cx + Math.cos(angle) * radius * 0.6);
            int ey = (int) (cy + Math.sin(angle) * radius * 0.6);
            g.drawLine(cx, cy, ex, ey);
        }

    }
}
