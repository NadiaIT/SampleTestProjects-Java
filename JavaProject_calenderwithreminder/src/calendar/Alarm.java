package calendar;

import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.ReminderDAO;
import data.ReminderEntity;

public class Alarm extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	int date, month, year;
	Clip clip;

	public Alarm(int date, int month, int year) {
		setSize(150, 150);
		setLocationRelativeTo(null);
		addComponents();
		this.date = date;
		this.month = month;
		this.year = year;

	}

	private void addComponents() {
		JLabel label = new JLabel("You've a schedule");
		JButton showButton = new JButton("Show Reminder");
		JButton okButton = new JButton("OK");
		panel.add(label);
		panel.add(showButton);
		panel.add(okButton);
		panel.setBackground(SystemColor.white);
		add(panel);
		showButton.addActionListener(this);
		okButton.addActionListener(this);
		getAlarm();

	}

	public void getAlarm() {

		try {
			File soundFile = new File("audio/alarm.wav");
			AudioInputStream audioIn = AudioSystem
					.getAudioInputStream(soundFile);
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
			clip.loop(15);

		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}

	}

	JFrame frame;

	public void reminderFrame() {

		frame = new JFrame();
		frame.setLayout(new GridLayout(0, 1));
		frame.setSize(100, 100);
		frame.setLocationRelativeTo(null);
		remButtons();
		frame.setVisible(true);
	}

	public void remButtons() {
		ReminderDAO dao = new ReminderDAO();
		ArrayList<ReminderEntity> arrayList = null;
		arrayList = dao.get();
		String months[] = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };
		for (ReminderEntity item : arrayList) {
			if (item.getDate() == date && item.getMonth().equals(months[month])
					&& item.getYear() == year) {
				JButton button = new JButton(item.getOccation());
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
				frame.add(button);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().contains("Show Reminder")) {
			reminderFrame();
		} else if (e.getActionCommand().contains("OK")) {
			if (clip.isRunning())
				clip.stop();
			dispose();
			RemOrCalndr remOrCal = new RemOrCalndr();
			remOrCal.setVisible(true);
			remOrCal.setResizable(false);
		}
	}

}
