package com.zouc.demo;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import java.util.Date;

/**
 * @author : zoucong@asiainfo.com
 * @desciption :
 * @date : 2020-04-23
 **/
public class VoiceDemo {
	/**
	 * ����ת���ֲ�����
	 *
	 * @param txt
	 */
	public static void textToSpeech(String text) {
		ActiveXComponent ax = null;
		try {
			ax = new ActiveXComponent("Sapi.SpVoice");

			// ����ʱ�����������
			Dispatch spVoice = ax.getObject();
			// ���� 0-100
			ax.setProperty("Volume", new Variant(100));
			// �����ʶ��ٶ� -10 �� +10
			ax.setProperty("Rate", new Variant(-2));
			// ִ���ʶ�
			Dispatch.call(spVoice, "Speak", new Variant(text));

			// �����ǹ����ļ��������������ļ�
			ax = new ActiveXComponent("Sapi.SpFileStream");
			Dispatch spFileStream = ax.getObject();

			ax = new ActiveXComponent("Sapi.SpAudioFormat");
			Dispatch spAudioFormat = ax.getObject();

			// ������Ƶ����ʽ
			Dispatch.put(spAudioFormat, "Type", new Variant(22));
			// �����ļ��������ʽ
			Dispatch.putRef(spFileStream, "Format", spAudioFormat);
			// ������� �ļ����򿪷���������һ��.wav�ļ�
			Dispatch.call(spFileStream, "Open", new Variant("busi.wav"), new Variant(3), new Variant(true));
			// ���������������Ƶ�����Ϊ����ļ�����
			Dispatch.putRef(spVoice, "AudioOutputStream", spFileStream);
			// �������� 0��100
			Dispatch.put(spVoice, "Volume", new Variant(100));
			// �����ʶ��ٶ�
			Dispatch.put(spVoice, "Rate", new Variant(-2));
			// ��ʼ�ʶ�
			Dispatch.call(spVoice, "Speak", new Variant(text));

			// �ر�����ļ�
			Dispatch.call(spFileStream, "Close");
			Dispatch.putRef(spVoice, "AudioOutputStream", null);

			spAudioFormat.safeRelease();
			spFileStream.safeRelease();
			spVoice.safeRelease();
			ax.safeRelease();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		textToSpeech("��άǰ��ƽ̨��������������ļ�����˴����쳣�澯���뼰ʱ�鿴���Ų�����");
	}
}
