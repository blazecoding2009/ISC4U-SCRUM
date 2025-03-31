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
        int cx = x + size / 2;
        int cy = y + size / 2;
        int radius = size / 2;

        // wheel body
        g.setColor(new Color(80, 80, 80));
        g.fillOval(x, y, size, size);

        // rim 
        g.setColor(new Color(50, 50, 50));
        g.drawOval(x, y, size, size);

        // first ring of treads
        g.setColor(new Color(60, 60, 60));
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30);
            int tx = (int) (cx + Math.cos(angle) * radius * 0.85);
            int ty = (int) (cy + Math.sin(angle) * radius * 0.85);
            g.fillRect(tx - 2, ty - 2, 4, 4);
        }

        // second ring of treads
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30 + 15); // offset from first ring
            int tx = (int) (cx + Math.cos(angle) * radius * 0.65);
            int ty = (int) (cy + Math.sin(angle) * radius * 0.65);
            g.fillRect(tx - 1, ty - 1, 3, 3);
        }

        // center hub
        int hubSize = size / 3;
        g.setColor(new Color(120, 120, 120));
        g.fillOval(cx - hubSize / 2, cy - hubSize / 2, hubSize, hubSize);

        // hub bolts
        g.setColor(new Color(90, 90, 90));
        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(i * 60);
            int bx = (int) (cx + Math.cos(angle) * hubSize / 3);
            int by = (int) (cy + Math.sin(angle) * hubSize / 3);
            g.fillOval(bx - 2, by - 2, 4, 4);
        }

        // wheel spokes
        g.setColor(new Color(150, 150, 150));
        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(i * 60);
            int ex = (int) (cx + Math.cos(angle) * radius * 0.6);
            int ey = (int) (cy + Math.sin(angle) * radius * 0.6);
            g.drawLine(cx, cy, ex, ey);
        }
    }
}
