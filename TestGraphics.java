import java.awt.*;
import java.awt.Graphics;


public class TestGraphics {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300, 500);

		Graphics g = panel.getGraphics();

		panel.setBackground(Color.yellow);

	
		g.setColor(Color.BLUE);
		g.fillOval(60, 40, 60, 60);
		g.fillOval(170, 40, 60, 60);
		g.setColor(Color.red);
		g.fillRect(100,75,100,100);
		g.setColor(Color.black);
		g.drawLine(100,150,200,150);

	}

}


