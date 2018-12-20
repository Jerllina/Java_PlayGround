import java.awt.Graphics;
import javax.swing.JPanel;
public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Clean the panel first.
		//g.drawString("hello", 20, 80);
		g.drawString("hello",
				(int)Math.round(Math.random() * this.getWidth()),
				(int)Math.round(Math.random() * this.getHeight()));
	}
}
