import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// Creating a flow layout manager which uses left-justification for rows
		// of components, 20 pixels for the horizontal gap between components, and
		// 40 pixels for the vertical gap between rows of components.
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 40);
		// Adding the flow layout manager to the frame.
		this.setLayout(fl);

		// Create a button and add it to the frame.
		this.add(new JButton("B1"));
		// Add another button to the frame, with different text.
		this.add(new JButton("B2"));
		this.setVisible(true);
	}
}
