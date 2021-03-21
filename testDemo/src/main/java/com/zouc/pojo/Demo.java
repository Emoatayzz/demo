package com.zouc.pojo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Calendar;

/**
 * @author : zoucong@asiainfo.com
 * @desciption :
 * @date : 2020-06-22
 **/
public class Demo {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		String timeWindow = now.get(Calendar.HOUR_OF_DAY) + "h";
		System.out.println(timeWindow);
		now.set(Calendar.DAY_OF_YEAR,now.get(Calendar.DAY_OF_YEAR)-1);
		now.set(Calendar.HOUR_OF_DAY, 23);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		// String previous= DateFormatUtils.format(now,"yyyyMMddHHmmssSSS");
		System.out.println(DateFormatUtils.format(Calendar.getInstance(), "yyyyMMddHHmmss"));
	}
}
