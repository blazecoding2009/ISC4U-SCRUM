package packageScrum;

import java.awt.Color;
import java.awt.Graphics;

public class Wheels {
    public void wheel(int x, int y, int size, Graphics g) {
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

    }
}
