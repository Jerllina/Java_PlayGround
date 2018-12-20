import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Clean the panel first.
		// Red 3D cube.
		g.setColor(Color.RED);
		g.drawRect(10, 20, 50, 50); // Front side.
		g.drawRect(30, 10, 50, 50); // Back side.
		g.drawLine(30, 10, 10, 20);
		g.drawLine(80, 10, 60, 20);
		g.drawLine(30, 60, 10, 70);
		g.drawLine(80, 60, 60, 70);
		// Blue 3D cylinder.
		g.setColor(Color.BLUE);
		g.drawOval(100, 10, 50, 10); // Top.
		g.drawOval(100, 60, 50, 10); // Bottom.
		g.drawLine(100, 15, 100, 65);
		g.drawLine(150, 15, 150, 65);
	}
}
