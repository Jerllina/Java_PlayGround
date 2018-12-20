
import javax.swing.JFrame;
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(new MyPanel()); // Adding one MyPanel to the frame.
		this.setVisible(true);
	}
}
