package programs_on_JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Login_page extends JFrame implements ActionListener
{
	JLabel l1,l2;
	
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	
	public Login_page() {
		
		l1 = new JLabel("username");
		l2 = new JLabel("password");
		t1 = new JTextField(25);
		t2 = new JPasswordField(25);
		b1 = new JButton("login");
		b2 = new JButton("close");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setTitle("login page");

		setSize(300, 300);

		setLayout(new FlowLayout());

		setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) {

     if(e.getSource()==b1)
     {
    	 String s1 = t1.getText();
    	 String s2 = new String(t2.getPassword());
    	 
    	 if(s1.equals("admin")&& s2.equals("1234"))
    	 {
    		 JOptionPane.showMessageDialog(this, "login successful");
    	 }
    	 else
    	 {
    		 JOptionPane.showMessageDialog(this, "invalid username or pass");
    	 }
    	 
     }
     if(e.getSource()==b2)
     {
    	 dispose();
     }
		
	}

	
}
public class Login {

	public static void main(String[] args) {
		Login_page p = new Login_page(); 

	}

}
