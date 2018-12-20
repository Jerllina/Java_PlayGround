import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class MyFrame2 extends JFrame {
	public MyFrame2() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// Creating a border layout manager, which automatically has 5 areas.
		// Then every time we add a component to the frame, we need to specify
		// in which of the five areas (north, south, east, west, center) the
		// component should go.
		BorderLayout bl = new BorderLayout();
		// Adding the flow layout manager to the frame.
		this.setLayout(bl);
		this.add(new JButton("B1"), BorderLayout.LINE_START); // Left
		this.add(new JButton("B2"), BorderLayout.LINE_END);   // Right
		JLabel l = new JLabel("Enter your name: ");
		this.add(l, BorderLayout.PAGE_START);                 // Top
		JTextField tx = new JTextField("Type Text Here");
		this.add(tx, BorderLayout.CENTER);                    // Center
		JCheckBox cb = new JCheckBox("I agree");
		this.add(cb, BorderLayout.PAGE_END);                  // Bottom, invisible
		JRadioButton rb = new JRadioButton("Yes");
		this.add(rb, BorderLayout.PAGE_END);                  // Bottom, invisible
		JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
		this.add(cb1, BorderLayout.PAGE_END);                 // Bottom, invisible
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
		this.add(cb2, BorderLayout.PAGE_END);                 // Bottom, visible
		this.setVisible(true);
	}
}
