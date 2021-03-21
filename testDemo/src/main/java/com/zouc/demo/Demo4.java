package com.zouc.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoucong@asiainfo.com
 * @desciption :
 * @date : 2020-06-22
 **/
public class Demo4 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(6);
		l.add(5);
		l.add(2);
		l.add(4);
		l.add(3);
		l.add(0);
		l.sort(Integer::compareTo);
		// System.out.println(l.subList(0, 3));
		Double d = 9*100 / 100d;
		System.out.println(d);
	}

}
