package packageScrum;

import java.awt.*;


public class ScrumBody {
		
		private int x, y, size;
		private Graphics g;
	
    	public ScrumBody(int x, int y, int size, Graphics g) {
    		this.x = x;
    		this.y = y;
    		this.g = g;
    		this.size = size;
    	}

    	public void addBody() {
    		g.setColor(new Color(80, 80, 80));
    		g.fillRect(x, y, size*2, size);
    		g.setColor(new Color(60,60,60));
    		g.fillRect(x+50,y+50, (size/2)*3, size/2);
    	}
}
