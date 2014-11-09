package calendar;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import window.Project;

public class RemOrCalndr extends JFrame implements ActionListener {

	JPanel panel = new JPanel();

	public RemOrCalndr() {
		setSize(150, 110);
		setLocationRelativeTo(null);
		addComponents();
	}

	private void addComponents() {
		JButton remButton = new JButton("Add reminder");
		JButton calButton = new JButton("View Calendar");
		panel.add(remButton);
		panel.add(calButton);
		panel.setBackground(SystemColor.white);
		add(panel);
		remButton.addActionListener(this);
		calButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().contains("Add reminder")) {
			Project reminder = new Project();
			reminder.setVisible(true);
		} else if (e.getActionCommand().contains("View Calendar")) {
			ViewCalender calender = new ViewCalender();
			calender.setResizable(false);
			calender.setVisible(true);
		}
	}
}
