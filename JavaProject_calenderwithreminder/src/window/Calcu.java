package window;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcu extends JPanel implements ActionListener {
	
	private static final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN,
			20);
	JTextField textfield = new JTextField("0", 12);
	int temp = 0;
	boolean isAorB = false;
	String a = "\0", b = "\0";
	String sResult = "\0";

	public Calcu() {
		initComponent();
	}

	public void initComponent() {

		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.setFont(BIGGER_FONT);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4, 4, 4));
		panel.setBackground(SystemColor.white);

		JButton buttonCE = new JButton("AC");

		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button_divide = new JButton("/");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button_mult = new JButton("*");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button_subs = new JButton("-");
		JButton button0 = new JButton("0");
		JButton button_point = new JButton(".");
		JButton button_equal = new JButton("=");
		JButton button_add = new JButton("+");
		JButton button_mod = new JButton("%");
		JButton button_sqr = new JButton("sqr");
		JButton button_invrse = new JButton("invrse");
		JButton button_rt = new JButton("rt");

		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		panel2.add(textfield);
		panel2.add(buttonCE);

		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button_divide);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button_mult);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button_subs);
		panel.add(button0);
		panel.add(button_point);
		panel.add(button_equal);
		panel.add(button_add);
		panel.add(button_mod);
		panel.add(button_sqr);
		panel.add(button_invrse);
		panel.add(button_rt);

		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button_add.addActionListener(this);
		button_divide.addActionListener(this);
		button_equal.addActionListener(this);
		button_invrse.addActionListener(this);
		button_mod.addActionListener(this);
		button_mult.addActionListener(this);
		button_point.addActionListener(this);
		button_rt.addActionListener(this);
		button_sqr.addActionListener(this);
		button_subs.addActionListener(this);
		buttonCE.addActionListener(this);

		add(panel2);

		add(panel);

	}

	public void actionPerformed(ActionEvent e) {

		Calculate c = new Calculate();
		double result = 0;
		if (e.getActionCommand().contains("AC")) {
			textfield.setText("0");
			a = "\0";
			b = "\0";
			isAorB = false;
		}
		if (isAorB == false) {

			if (e.getActionCommand().contains("0")) {
				a = a.concat("0");
			} else if (e.getActionCommand().contains("1")) {
				a = a.concat("1");
			} else if (e.getActionCommand().contains("2")) {
				a = a.concat("2");
			} else if (e.getActionCommand().contains("3")) {
				a = a.concat("3");
			} else if (e.getActionCommand().contains("4")) {
				a = a.concat("4");
			} else if (e.getActionCommand().contains("5")) {
				a = a.concat("5");
			} else if (e.getActionCommand().contains("6")) {
				a = a.concat("6");
			} else if (e.getActionCommand().contains("7")) {
				a = a.concat("7");
			} else if (e.getActionCommand().contains("8")) {
				a = a.concat("8");
			} else if (e.getActionCommand().contains("9")) {
				a = a.concat("9");
			} else if (e.getActionCommand().contains(".")) {
				a = a.concat(".");
			}
			textfield.setText(a);
		} else if (isAorB == true) {
			if (a == "\0")
				a = sResult;

			if (e.getActionCommand().contains("0")) {
				b = b.concat("0");
			} else if (e.getActionCommand().contains("1")) {
				b = b.concat("1");
			} else if (e.getActionCommand().contains("2")) {
				b = b.concat("2");
			} else if (e.getActionCommand().contains("3")) {
				b = b.concat("3");
			} else if (e.getActionCommand().contains("4")) {
				b = b.concat("4");
			} else if (e.getActionCommand().contains("5")) {
				b = b.concat("5");
			} else if (e.getActionCommand().contains("6")) {
				b = b.concat("6");
			} else if (e.getActionCommand().contains("7")) {
				b = b.concat("7");
			} else if (e.getActionCommand().contains("8")) {
				b = b.concat("8");
			} else if (e.getActionCommand().contains("9")) {
				b = b.concat("9");
			} else if (e.getActionCommand().contains(".")) {
				b = b.concat(".");
			}
			textfield.setText(b);
		}

		if (e.getActionCommand().contains("+")) {
			temp = 1;
			isAorB = true;
			textfield.setText("+");
		} else if (e.getActionCommand().contains("-")) {
			temp = 2;
			isAorB = true;
			textfield.setText("-");
		} else if (e.getActionCommand().contains("*")) {
			temp = 3;
			isAorB = true;
			textfield.setText("*");
		} else if (e.getActionCommand().contains("/")) {
			temp = 4;
			isAorB = true;
			textfield.setText("/");
		} else if (e.getActionCommand().contains("%")) {
			temp = 5;
			isAorB = true;
			textfield.setText("%");
		} else if (e.getActionCommand().contains("sqr")) {
			textfield.setText("^2");
			temp = 6;
		} else if (e.getActionCommand().contains("rt")) {
			textfield.setText("sqrt");
			temp = 7;
		} else if (e.getActionCommand().contains("invrse")) {
			textfield.setText("1/x");
			temp = 8;
		}
		try {
			if (e.getActionCommand().contains("=")) {
				if (temp == 0 && a != "\0") {
					result = Double.parseDouble(a);
				}
				if (temp == 1) {
					result = c.add(a, b);
					temp = 0;
				}
				if (temp == 2) {
					result = c.substract(a, b);
					temp = 0;
				}
				if (temp == 3) {
					result = c.multiple(a, b);
					temp = 0;
				}
				if (temp == 4) {
					result = c.division(a, b);
					temp = 0;
				}
				if (temp == 5) {
					result = c.mod(a, b);
					temp = 0;
				}
				if (temp == 6) {
					if (a == "\0")
						a = sResult;
					result = c.sqr(a);
					temp = 0;
				}
				if (temp == 7) {
					if (a == "\0")
						a = sResult;
					result = c.sqrrt(a);
					temp = 0;
				}
				if (temp == 8) {
					if (a == "\0")
						a = sResult;
					result = c.invrse(a);
					temp = 0;
				}
				sResult = Double.toString(result);
				textfield.setText(sResult);
				a = "\0";
				b = "\0";
				isAorB = false;
			}
		} catch (IllegalArgumentException i) {
			a = "\0";
			b = "\0";
			isAorB = false;
		}

	}

}
