package calendar;

import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.ReminderDAO;
import data.ReminderEntity;

public class MonthlyCal extends JFrame implements ActionListener {

	ReminderEntity entity = new ReminderEntity();
	ReminderDAO dao = new ReminderDAO();
	ArrayList<ReminderEntity> arrayList = null;

	GregorianCalendar calendar = new GregorianCalendar();
	int month, year;
	boolean image = false;
	String months[] = { "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December" };
	int mnth_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	JPanel panel = new JPanel();

	public MonthlyCal(int month, int year) {
		panel.setLayout(new GridLayout(0, 7));
		panel.setBackground(SystemColor.white);
		print(month, year);
	}

	public void print(int month, int year) {
		this.month = month;
		this.year = year;
		GregorianCalendar calendar1 = new GregorianCalendar();
		String week[] = { "Wednesday", "Thursday", "Friday", "Saturday",
				"Sunday", "Monday", "Tuesday" };
		int day;
		int adjust_week;
		if (month < 0 || month > 11) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,
					"Month must be in between 1-12", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (year <= 0) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,
					"Year must be positive integer", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		setTitle(months[month] + " " + year);
		setSize(700, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		day = mnth_days[month];

		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				&& month == 1)
			day++;
		calendar1.set(Calendar.MONTH, month);
		calendar1.set(Calendar.YEAR, year);
		adjust_week = calendar1.get(Calendar.DAY_OF_WEEK) - 1;

		for (int i = 0; i < 7; i++) {
			JLabel label = new JLabel("       " + week[i]);
			panel.add(label);
		}

		for (int i = 0; i < adjust_week; i++) {
			JLabel label = new JLabel(" ");
			panel.add(label);
		}

		for (int i = 1; i <= day; i++) {
			arrayList = dao.get();
			for (ReminderEntity item : arrayList) {
				if (item.getDate() == i
						&& item.getMonth().equals(months[month])
						&& item.getYear() == year) {
					image = true;
					break;
				}
			}

			JButton button = new JButton("" + i);
			button.setBackground(SystemColor.pink);
			if (i == calendar.get(Calendar.DATE)
					&& month == calendar.get(Calendar.MONTH)
					&& year == calendar.get(Calendar.YEAR))
				button.setBackground(SystemColor.magenta);
			if (image == true) {
				button.setIcon(new ImageIcon("Image/bell2.jpg"));
				image = false;
			}
			button.addActionListener(this);
			panel.add(button);
		}
		add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		SetReminder setRem = new SetReminder(e.getActionCommand(), month, year);
		setRem.setVisible(true);
	}
}