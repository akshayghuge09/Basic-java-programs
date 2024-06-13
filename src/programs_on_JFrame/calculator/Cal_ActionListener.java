package programs_on_JFrame.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal_ActionListener implements ActionListener {

	Calculator_view v;

	public Cal_ActionListener(Calculator_view v) {
		super();
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == v.b1) {
			int x = Integer.parseInt(v.t1.getText());
			int y = Integer.parseInt(v.t2.getText());
			int res = x + y;
			v.t3.setText(Integer.toString(res));

		}
		if (e.getSource() == v.b2) {
			int x = Integer.parseInt(v.t1.getText());
			int y = Integer.parseInt(v.t2.getText());
			int res = x - y;
			v.t3.setText(Integer.toString(res));

		}
		if (e.getSource() == v.b3) {
			int x = Integer.parseInt(v.t1.getText());
			int y = Integer.parseInt(v.t2.getText());
			int res = x * y;
			v.t3.setText(Integer.toString(res));

		}
		if (e.getSource() == v.b4) {
			int x = Integer.parseInt(v.t1.getText());
			int y = Integer.parseInt(v.t2.getText());
			int res = x / y;
			v.t3.setText(Integer.toString(res));

		}
		if (e.getSource() == v.b5) {

			v.t1.setText(" ");
			v.t2.setText(" ");
			v.t3.setText(" ");

		}
		if (e.getSource() == v.b6) {
			v.dispose();
		}

	}

}
