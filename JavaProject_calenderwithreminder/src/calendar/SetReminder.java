package calendar;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data.ReminderDAO;
import data.ReminderEntity;

public class SetReminder extends JFrame implements ActionListener {

	ReminderEntity entity = new ReminderEntity();
	ReminderDAO dao = new ReminderDAO();
	ArrayList<ReminderEntity> arrayList = null;

	boolean remAdded;
	int date, year, month;
	String occatn;
	JTextField field;
	String months[] = { "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December" };

	public SetReminder(String date, int month, int year) {
		this.date = Integer.parseInt(date);
		this.month = month;
		this.year = year;
		remAdded = false;
		setSize(150, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		JPanel panel = new JPanel();
		JButton button = new JButton("Show Reminder");
		JLabel label = new JLabel("Want to set reminder?");
		JLabel occation = new JLabel("Occation");
		field = new JTextField(10);
		panel.add(button);
		panel.add(occation);
		panel.add(field);
		panel.add(label);
		JButton yesButton = new JButton("Yes");
		panel.add(yesButton);
		JButton noButton = new JButton("No");
		panel.add(noButton);
		add(panel);
		button.addActionListener(this);
		yesButton.addActionListener(this);
		noButton.addActionListener(this);
	}

	JFrame frame;

	public void reminderFrame() {

		frame = new JFrame();
		frame.setLayout(new GridLayout(0, 1));
		frame.setSize(150, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		remButton();

	}

	void remButton() {
		boolean flag = false;
		arrayList = dao.get();
		for (ReminderEntity item : arrayList) {
			if (item.getDate() == date && item.getMonth().equals(months[month])
					&& item.getYear() == year) {
				flag = true;
				JButton button = new JButton(item.getOccation());
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
				frame.add(button);
			}
		}
		if (flag == false) {
			JButton noReminder = new JButton("No Reminder");
			frame.add(noReminder);
			noReminder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
		}
	}

	public void addReminder() {
		ReminderEntity re = new ReminderEntity();
		ReminderDAO rd = new ReminderDAO();
		occatn = field.getText();
		re.setDate(date);
		re.setYear(year);
		re.setMonth(months[month]);
		re.setOccation(occatn);
		rd.insert(re);
	}

	void addFrame() {
		addReminder();

		final JFrame frame = new JFrame();
		JButton msg = new JButton("Reminder added");
		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		frame.setSize(200, 80);
		frame.setLocationRelativeTo(null);
		frame.add(msg);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().contains("Show Reminder")) {
			reminderFrame();

		}

		else if (e.getActionCommand().contains("Yes")) {
			addFrame();
			dispose();

		} else if (e.getActionCommand().contains("No")) {
			dispose();
		}
	}
}