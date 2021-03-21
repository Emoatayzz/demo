package com.zouc.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : zoucong
 * @date : 2020-03-27
 **/
public class Demo3 {
	public static void main(String[] args) {
		// String s = "[1, 2]";
		//
		// String[] s1 = new String[]{"1", "logtime"};
		// System.out.println(Arrays.asList(s).get(0));
		// System.out.println();

		try {
			throw new NullPointerException();
		} catch (Exception e) {
			// e.printStackTrace();
			// System.out.println(Arrays.toString(e.getMessage()));
			System.out.println(e + Arrays.toString(e.getStackTrace()));
			System.out.println(e.getCause());
		}

		// String s2 = Arrays.toString(s1);
		// System.out.println(s2);
		// System.out.println(JSONArray.parseArray(s));

	}
}
