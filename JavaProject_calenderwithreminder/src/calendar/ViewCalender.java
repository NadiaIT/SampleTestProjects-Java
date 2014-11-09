package calendar;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewCalender extends JFrame implements ActionListener {
	JPanel panel = new JPanel();

	String month;
	String year;
	JTextField monthField, yearField;
	GregorianCalendar calendar = new GregorianCalendar();

	public ViewCalender() {
		setTitle("Calendar");
		setSize(200, 180);
		setLocationRelativeTo(null);
		addComponents();
	}

	public void addComponents() {
		monthField = new JTextField(8);
		yearField = new JTextField(12);

		JLabel monthLabel = new JLabel("Month(1-12)");
		JLabel yearLabel = new JLabel("Year");

		JButton doneButton = new JButton("View Calendar");
		JButton todaycal = new JButton("Calendar of the Current Month");

		panel.add(monthLabel);
		panel.add(monthField);
		panel.add(yearLabel);
		panel.add(yearField);

		panel.add(doneButton, CENTER_ALIGNMENT);
		panel.add(todaycal, CENTER_ALIGNMENT);

		panel.setBackground(SystemColor.white);
		add(panel);

		doneButton.addActionListener(this);
		todaycal.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		int iMonth, iYear;
		if (e.getActionCommand().contains("View Calendar")) {

			month = monthField.getText();
			year = yearField.getText();

			try {
				iMonth = Integer.parseInt(month);
				iYear = Integer.parseInt(year);
				MonthlyCal mnth = new MonthlyCal(iMonth - 1, iYear);
			} catch (Exception ex) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame,
						"Year and Month must be integers", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getActionCommand().contains("Calendar of the Current Month")) {
			iMonth = calendar.get(Calendar.MONTH);
			iYear = calendar.get(Calendar.YEAR);
			MonthlyCal mnth = new MonthlyCal(iMonth, iYear);
		}
	}
}
