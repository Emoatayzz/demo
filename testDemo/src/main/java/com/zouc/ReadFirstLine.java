package com.zouc;

import java.io.RandomAccessFile;

/**
 * @author : zoucong@asiainfo.com
 * @description :
 * @date : 2020-07-13
 **/
public class ReadFirstLine {
	public static void main(String[] args) {
		RandomAccessFile raf;
		String firstLine = "";
		try {
			raf = new RandomAccessFile("H:\\»úÆ÷ÐÅÏ¢.txt", "r");
			firstLine = raf.readLine();
			System.out.println(firstLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
