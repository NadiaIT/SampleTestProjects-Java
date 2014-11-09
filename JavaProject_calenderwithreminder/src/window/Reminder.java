package window;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import data.ReminderDAO;
import data.ReminderEntity;

public class Reminder extends JPanel implements ActionListener {

	JPanel panel = new JPanel();
	JPanel pane = new JPanel();

	String date;
	String year;
	String occation;
	JTextField dateField, yearField, occationField;
	JRadioButton jan, feb, march, april, may, june, july, august, sept, oct,
			nov, dec;

	public Reminder() {
		addComponents();
	}

	public void addComponents() {
		pane.setLayout(new FlowLayout());
		panel.setLayout(new GridLayout(5, 3, 4, 4));
		dateField = new JTextField(2);
		yearField = new JTextField(4);
		occationField = new JTextField(6);

		JLabel dateLabel = new JLabel("Date");
		JLabel yearLabel = new JLabel("Year");
		JLabel occationLabel = new JLabel("Occation");

		ButtonGroup group = new ButtonGroup();

		jan = new JRadioButton("January");
		feb = new JRadioButton("February");
		march = new JRadioButton("March");
		april = new JRadioButton("April");
		may = new JRadioButton("May");
		june = new JRadioButton("June");
		july = new JRadioButton("July");
		august = new JRadioButton("August");
		sept = new JRadioButton("September");
		oct = new JRadioButton("October");
		nov = new JRadioButton("November");
		dec = new JRadioButton("December");

		JButton doneButton = new JButton("Done");

		group.add(jan);
		group.add(feb);
		group.add(march);
		group.add(april);
		group.add(may);
		group.add(june);
		group.add(july);
		group.add(august);
		group.add(sept);
		group.add(oct);
		group.add(nov);
		group.add(dec);

		panel.add(jan);
		panel.add(feb);
		panel.add(march);
		panel.add(april);
		panel.add(may);
		panel.add(june);
		panel.add(july);
		panel.add(august);
		panel.add(sept);
		panel.add(oct);
		panel.add(nov);
		panel.add(dec);
		panel.add(doneButton, CENTER_ALIGNMENT);
		panel.setBackground(SystemColor.cyan);

		pane.add(dateLabel);
		pane.add(dateField);
		pane.add(yearLabel);
		pane.add(yearField);
		pane.add(occationLabel);
		pane.add(occationField);

		add(pane);

		add(panel);

		doneButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		int iDate, iYear;

		date = dateField.getText();
		year = yearField.getText();
		occation = occationField.getText();

		try {

			ReminderEntity re = new ReminderEntity();
			ReminderDAO rd = new ReminderDAO();
			iDate = Integer.parseInt(date);
			iYear = Integer.parseInt(year);

			re.setDate(iDate);
			re.setYear(iYear);
			re.setOccation(occation);
			if (jan.isSelected()) {
				re.setMonth("January");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (feb.isSelected()) {
				re.setMonth("February");
				if ((iDate < 1
						|| iDate > 29)
						&& (((iYear % 4 == 0 && iYear % 100 != 0) || iYear % 400 == 0))) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-29", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				} else if (iDate < 1 || iDate > 28) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-28", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (march.isSelected()) {
				re.setMonth("March");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (april.isSelected()) {
				re.setMonth("April");
				if (iDate < 1 || iDate > 30) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-30", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (may.isSelected()) {
				re.setMonth("May");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (june.isSelected()) {
				re.setMonth("June");
				if (iDate < 1 || iDate > 30) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-30", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (july.isSelected()) {
				re.setMonth("July");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (august.isSelected()) {
				re.setMonth("August");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (sept.isSelected()) {
				re.setMonth("September");
				if (iDate < 1 || iDate > 30) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-30", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (oct.isSelected()) {
				re.setMonth("October");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (nov.isSelected()) {
				re.setMonth("November");
				if (iDate < 1 || iDate > 30) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-30", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else if (dec.isSelected()) {
				re.setMonth("December");
				if (iDate < 1 || iDate > 31) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,
							"Day must be in between 1-31", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			} else {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Select a month", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (iYear <= 0) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame,
						"Year must be positive integer", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			rd.insert(re);
			final JFrame frame = new JFrame();
			JButton msg = new JButton("Reminder added");
			frame.setSize(200, 80);
			frame.setLocationRelativeTo(null);
			frame.add(msg);
			msg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			frame.setVisible(true);
		} catch (Exception ex) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,
					"Year and Date must be integers", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
