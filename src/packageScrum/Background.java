package packageScrum;

import java.awt.*;

public class Background {
	public Background() {
	}

	/**
	 * This method draws the background
	 * @param g graphics object to draw the background
	 * @param width width of the background
	 * @param height height of the background
	 */
	public void drawMarsBackground(Graphics g, int width, int height) {
	    // Draw the sky
	    g.setColor(new Color(210, 160, 140)); // dusty pink-orange sky
	    g.fillRect(0, 0, width, height / 2);

	    // Draw the ground
	    g.setColor(new Color(155, 100, 50)); // Martian soil brown
	    g.fillRect(0, height / 2, width, height / 2);

	    // Add rocks
	    g.setColor(new Color(120, 70, 40));
	    for (int i = 0; i < 20; i++) {
	        int x = (int)(Math.random() * width);
	        int y = (int)(height / 2 + Math.random() * (height / 2));
	        int w = 10 + (int)(Math.random() * 15);
	        int h = 6 + (int)(Math.random() * 10);
	        g.fillOval(x, y, w, h);
	    }

	    g.setColor(new Color(100, 60, 30));
	    for (int i = 0; i < 40; i++) {
	        int x = (int)(Math.random() * width);
	        int y = (int)(height / 2 + Math.random() * (height / 2));
	        int s = 2 + (int)(Math.random() * 3);
	        g.fillOval(x, y, s, s);
	    }
	}
}