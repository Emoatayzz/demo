package com.zouc.demo;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoucong@asiainfo.com
 * @description :
 * @date : 2020-07-31
 **/
public class Demo5 {
	public static void main(String[] args) {

		// String s3 = "###580dc78423a4b7fe9225ca5b3d1e1292###50106###Windows Server 2008 R2 Enterprise###12810\\tSecurity\\t3216028\\t1596161460\\t5156\\tMicrosoft-Windows-Security-Auditing\\tnull\\t8\\texpsecretapp1\\t(12810)\\tWindows ɸѡƽ̨���������ӡ�\\r\\n\\r\\nӦ�ó�����Ϣ:\\r\\n\\t���� ID:\\t\\t4516\\r\\n\\tӦ�ó�������:\\tdeviceharddiskvolume3program files (x86)tpmserverv3webplatformjavaservice.exe\\r\\n\\r\\n������Ϣ:\\r\\n\\t����:\\t\\t%%14593\\r\\n\\tԴ��ַ:\\t\\t10.9.2.31\\r\\n\\tԴ�˿�:\\t\\t57579\\r\\n\\tĿ���ַ:\\t192.168.146.239\\r\\n\\tĿ��˿�:\\t\\t9092\\r\\n\\tЭ��:\\t\\t6\\r\\n\\r\\nɸѡ����Ϣ:\\r\\n\\tɸѡ������ʱ ID:\\t69673\\r\\n\\t������:\\t\\t%%14611\\r\\n\\t������ʱ ID:\\t48";
		// String s1 = StringUtils.substringBefore(s3, "\\r\\n\\tԴ�˿�");
		// String args2 = "Դ��ַ:\\t\\t";
		// System.out.println(s1.substring(s1.lastIndexOf(args2) + args2.length()));

		Map<String, Object> map = new HashMap<>();
		String s = "{\"dev_name\":\"ɽ����������\",\"severity\":0,\"log_province\":\"8370000\",\"collect_ipv6\":\"\",\"type\":\"windows\",\"message\":\"###580dc78423a4b7fe9225ca5b3d1e1292###50106###Windows Server 2008 R2 Enterprise###12810\\tSecurity\\t3216028\\t1596161460\\t5156\\tMicrosoft-Windows-Security-Auditing\\tnull\\t8\\texpsecretapp1\\t(12810)\\tWindows ɸѡƽ̨���������ӡ�\\r\\n\\r\\nӦ�ó�����Ϣ:\\r\\n\\t���� ID:\\t\\t4516\\r\\n\\tӦ�ó�������:\\tdeviceharddiskvolume3program files (x86)tpmserverv3webplatformjavaservice.exe\\r\\n\\r\\n������Ϣ:\\r\\n\\t����:\\t\\t%%14593\\r\\n\\tԴ��ַ:\\t\\t10.9.2.31\\r\\n\\tԴ�˿�:\\t\\t57579\\r\\n\\tĿ���ַ:\\t192.168.146.239\\r\\n\\tĿ��˿�:\\t\\t9092\\r\\n\\tЭ��:\\t\\t6\\r\\n\\r\\nɸѡ����Ϣ:\\r\\n\\tɸѡ������ʱ ID:\\t69673\\r\\n\\t������:\\t\\t%%14611\\r\\n\\t������ʱ ID:\\t48 \",\"devMAC\":\"\",\"dev_mod\":\"����\",\"tags\":[\"_grokparsefailure_sysloginput\"],\"devIPv6\":\"\",\"devIPv4\":\"10.9.2.31\",\"host\":\"10.9.2.31\",\"facility\":0,\"logTime\":\"2020-07-31T02:11:09.507Z\",\"facility_label\":\"kernel\",\"equ_manuf\":\"042\",\"priority\":\"0\",\"Log_type\":\"005\",\"@timestamp\":\"2020-07-31T02:11:09.507Z\",\"collect_ipv4\":\"172.16.26.135\",\"severity_label\":\"Emergency\"}";

		map.put("logContent", s);


		JSONObject jsonObject = JSONUtil.parseObj(map.get("logContent"));

		// com.alibaba.fastjson.JSONObject jsonObject2 = map.get("logContent");
		// System.out.println(jsonObject2);
		System.out.println(jsonObject.getStr("message"));
		// JSONObject jsonObject1 = new JSONObject();
		// jsonObject1.append("key1", "value1");
		// jsonObject1.set("key2", "value2");
		// jsonObject1.put("key3", "value3");
		// System.out.println(jsonObject1.getStr("key1"));
		// System.out.println(jsonObject1.getStr("key2"));
		// System.out.println(jsonObject1.getStr("key3"));

	}
}
