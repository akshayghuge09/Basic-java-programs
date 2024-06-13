package programs_on_JFrame.calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator_view extends JFrame {
	public JLabel l1, l2, l3;
	public JTextField t1, t2, t3;
	public JButton b1, b2, b3, b4, b5, b6;

	public Calculator_view() {
		l1 = new JLabel("First No: ");
		t1 = new JTextField();
		l2 = new JLabel("Second No: ");
		t2 = new JTextField();

		b1 = new JButton("+");
		b2 = new JButton("-");
		b3 = new JButton("*");
		b4 = new JButton("/");

		l3 = new JLabel("Result: ");
		t3 = new JTextField();

		b5 = new JButton("Reset");
		b6 = new JButton("Cancle");

		l1.setBounds(10, 10, 100, 40);
		t1.setBounds(120, 10, 100, 40);
		l2.setBounds(10, 60, 100, 40);
		t2.setBounds(120, 60, 100, 40);

		b1.setBounds(10, 120, 60, 50);
		b2.setBounds(90, 120, 60, 50);
		b3.setBounds(170, 120, 60, 50);
		b4.setBounds(250, 120, 60, 50);

		l3.setBounds(10, 180, 100, 40);
		t3.setBounds(90, 180, 100, 40);

		b5.setBounds(10, 250, 100, 40);
		b6.setBounds(160, 250, 100, 40);

		b1.addActionListener(new Cal_ActionListener(this));
		b2.addActionListener(new Cal_ActionListener(this));
		b3.addActionListener(new Cal_ActionListener(this));
		b4.addActionListener(new Cal_ActionListener(this));
		b5.addActionListener(new Cal_ActionListener(this));
		b6.addActionListener(new Cal_ActionListener(this));

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		add(t3);
		add(b5);
		add(b6);

		setTitle("My Calculator");

		setSize(400, 400);

		setLayout(null);

		setVisible(true);
	}

}
