package com.singletonpatterntest;
/*����2������ʱ���ж�ʵ���Ƿ�Ϊ�� Ϊ�ղŻ��½�ʵ��
 * ȱ�㣺���ж��̲߳��е��ã��ᴴ�����ʵ��
 */
public class Wife2 {
	//δnew�½�ʵ��
	private static Wife2 wf2;
	private Wife2() {
	}
	//�жϼ��½�
	public static Wife2 getWife() {
		if(wf2==null) {
			wf2=new Wife2();
		}
		return wf2;
	}
}
