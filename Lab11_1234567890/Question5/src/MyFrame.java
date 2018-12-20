import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// Border layout manager for the frame itself.
		this.setLayout(new BorderLayout());
		// Define the three panels.
		// The first panel uses a border layout manager.
		// The second panel uses a centered flow layout manager.
		// The third panel uses a 2 x 2 grid layout manager.
		// Note: we could also set the layout managers for the three panels using
		// the setLayout method of each panel, the result would be the same.
		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel p3 = new JPanel(new GridLayout(2, 2));
		// Give different colors to the panels to make them easier to see.
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.RED);
		// Add the three panels to the frame.
		this.add(p1, BorderLayout.PAGE_START); // Top
		this.add(p2, BorderLayout.CENTER);     // Center
		this.add(p3, BorderLayout.PAGE_END);   // Bottom
		// Add the two buttons to the first panel.
		p1.add(new JButton("B1"), BorderLayout.LINE_START); // Left
		p1.add(new JButton("B2"), BorderLayout.LINE_END);   // Right
		// Add the JLabel and JTextField to the second panel.
		JLabel l = new JLabel("Enter your name: ");
		p2.add(l);
		JTextField tx = new JTextField("Type Text Here");
		p2.add(tx);
		// Add the JCheckBox, JRadioButton, and the two JComboBox to the third panel.
		JCheckBox cb = new JCheckBox("I agree");
		p3.add(cb);
		JRadioButton rb = new JRadioButton("Yes");
		p3.add(rb);
		JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
		p3.add(cb1);
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
		p3.add(cb2);
		// And make the frame visible.
		this.setVisible(true);
	}
}
