package calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import data.ReminderDAO;
import data.ReminderEntity;

public class Checker {
	boolean flag;
	ArrayList<ReminderEntity> arrayList;
	int date, year, month;

	public Checker() {
		flag = false;
		arrayList = null;
	}

	public void check() {
		ReminderDAO dao = new ReminderDAO();
		arrayList = dao.get();
		getDate();
		String months[] = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };

		for (ReminderEntity item : arrayList) {
			if (item.getDate() == date && item.getMonth().equals(months[month])
					&& item.getYear() == year) {
				Alarm alarm = new Alarm(date, month, year);
				alarm.setVisible(true);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			RemOrCalndr remOrCal = new RemOrCalndr();
			remOrCal.setVisible(true);
			remOrCal.setResizable(false);
		}
	}

	public void getDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		date = calendar.get(Calendar.DATE);
		month = calendar.get(Calendar.MONTH);
		year = calendar.get(Calendar.YEAR);
	}

}
