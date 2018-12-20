import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 40);
		this.setLayout(fl);
		this.add(new JButton("B1"));
		this.add(new JButton("B2"));
		// Creating new components and adding them to the frame.
		JLabel l = new JLabel("Enter your name: ");
		this.add(l);
		JTextField tx = new JTextField("Type Text Here");
		this.add(tx);
		JCheckBox cb = new JCheckBox("I agree");
		this.add(cb);
		JRadioButton rb = new JRadioButton("Yes");
		this.add(rb);
		JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
		this.add(cb1);
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
		this.add(cb2);
		this.setVisible(true);
	}
}

