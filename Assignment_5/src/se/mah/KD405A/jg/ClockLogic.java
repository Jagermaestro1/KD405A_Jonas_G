package se.mah.KD405A.jg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockLogic {

	private DigitalClockGUI ClockGUI;
	private int alarmHour;
	private int alarmMinute;
	private DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
	private DateFormat timeFormatAlarm = new SimpleDateFormat("hh:mm");

	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		this.ClockGUI = digitalClockGUI;
		ClockThread clockThread = new ClockThread();
		clockThread.start();
		System.out.println(ClockGUI);

	}

	public void setAlarm(int hour, int minute) {
		this.alarmHour = hour;
		this.alarmMinute = minute;
		System.out.println(hour + ":" + minute);
	}

	public void clearAlarm() {
		alarmHour = 0;
		alarmMinute = 61;
		System.out.println(alarmHour + ":" + alarmMinute);
	}

	public class ClockThread extends Thread {
		public void run() {
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				Date date = new Date();
				String time = timeFormat.format(date);
				ClockGUI.setTimeOnLabel(time);
				String time2 = timeFormatAlarm.format(date);
				System.out.println(time2.toString());
				if (alarmHour < 10 && alarmMinute > 9) {
					if (time2.equals("0" + alarmHour + ":" + alarmMinute)) {
						ClockGUI.activateAlarm(true);
						boolean test = true;
						System.out.println(test);
					} else {
						ClockGUI.activateAlarm(false);
						boolean test = false;
						System.out.print(test);
					}
				}
				if (alarmHour > 9 && alarmMinute < 10) {
					if (time2.equals(alarmHour + ":" + "0" + alarmMinute)) {
						ClockGUI.activateAlarm(true);
						boolean test = true;
						System.out.println(test);
					} else {
						ClockGUI.activateAlarm(false);
						boolean test = false;
						System.out.print(test);
					}
				}
				if (alarmHour < 10 && alarmMinute < 10) {
					if (time2.equals("0" + alarmHour + ":" + "0" + alarmMinute)) {
						ClockGUI.activateAlarm(true);
						boolean test = true;
						System.out.println(test);
					} else {
						ClockGUI.activateAlarm(false);
						boolean test = false;
						System.out.print(test);
					}
				}
			}
		}
	}
}
