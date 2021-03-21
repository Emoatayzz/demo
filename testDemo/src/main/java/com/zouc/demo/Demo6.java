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
public class Demo6 {
	public static void main(String[] args) {


		Map<String, Object> map = new HashMap<>();
		String s = "{\"dev_name\":\"山东电信自研\",\"severity\":0,\"log_province\":\"8370000\",\"collect_ipv6\":\"\",\"type\":\"windows\",\"message\":\"###580dc78423a4b7fe9225ca5b3d1e1292###50106###Windows Server 2008 R2 Enterprise###12810\\tSecurity\\t3216028\\t1596161460\\t5156\\tMicrosoft-Windows-Security-Auditing\\tnull\\t8\\texpsecretapp1\\t(12810)\\tWindows 筛选平台已允许连接。\\r\\n\\r\\n应用程序信息:\\r\\n\\t进程 ID:\\t\\t4516\\r\\n\\t应用程序名称:\\tdeviceharddiskvolume3program files (x86)tpmserverv3webplatformjavaservice.exe\\r\\n\\r\\n网络信息:\\r\\n\\t方向:\\t\\t%%14593\\r\\n\\t源地址:\\t\\t10.9.2.31\\r\\n\\t源端口:\\t\\t57579\\r\\n\\t目标地址:\\t192.168.146.239\\r\\n\\t目标端口:\\t\\t9092\\r\\n\\t协议:\\t\\t6\\r\\n\\r\\n筛选器信息:\\r\\n\\t筛选器运行时 ID:\\t69673\\r\\n\\t层名称:\\t\\t%%14611\\r\\n\\t层运行时 ID:\\t48 \",\"devMAC\":\"\",\"dev_mod\":\"自研\",\"tags\":[\"_grokparsefailure_sysloginput\"],\"devIPv6\":\"\",\"devIPv4\":\"10.9.2.31\",\"host\":\"10.9.2.31\",\"facility\":0,\"logTime\":\"2020-07-31T02:11:09.507Z\",\"facility_label\":\"kernel\",\"equ_manuf\":\"042\",\"priority\":\"0\",\"Log_type\":\"005\",\"@timestamp\":\"2020-07-31T02:11:09.507Z\",\"collect_ipv4\":\"172.16.26.135\",\"severity_label\":\"Emergency\"}";

		JSONObject data = JSONUtil.parseObj(s);
		JSONObject json = new JSONObject();

		json.put("logContent", s);


		System.out.println(json.getStr("logContent"));

	}
}
