package com.zouc.demo;

import java.util.Calendar;

/**
 * @author : zoucong
 * @date : 2020-03-31
 **/
public class Demo {
	public static void main(String[] args) {
		// String s = "a\\b";
		// s = s.replace("\\", "//");
		// System.out.println(s);
		// String path = new Demo().getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		// System.out.println(path);

		// System.out.println(inCallOutTimePeriod());
		if (inCallOutTimePeriod()) {
			System.out.println("----------------");
		}
	}

	private static boolean inCallOutTimePeriod() {
		Calendar now = Calendar.getInstance();
		now.set(2020, 5, 1, 22, 0, 0);
		// now.set(Calendar.DAY_OF_WEEK, 2);
		Calendar startCallTime = Calendar.getInstance();
		Calendar endCallTime = Calendar.getInstance();

		startCallTime.set(Calendar.DAY_OF_MONTH, now.get(Calendar.DAY_OF_MONTH));
		startCallTime.set(Calendar.HOUR_OF_DAY, 20);
		startCallTime.set(Calendar.MINUTE, 0);
		startCallTime.set(Calendar.SECOND, 0);

		endCallTime.set(Calendar.DAY_OF_MONTH, now.get(Calendar.DAY_OF_MONTH) + 1);
		endCallTime.set(Calendar.HOUR_OF_DAY, 6);
		endCallTime.set(Calendar.MINUTE, 0);
		endCallTime.set(Calendar.SECOND, 0);

		System.out.println("now------" + now.getTime());
		System.out.println("start------" +startCallTime.getTime());
		System.out.println("end------" +endCallTime.getTime());
		return now.getTimeInMillis() > startCallTime.getTimeInMillis() && now.getTimeInMillis() < endCallTime.getTimeInMillis();
	}
}
