package com.singletonpatterntest;
/*����3��2�Ļ����ϼ����߳�ͬ�� ��֤ͬһʱ�����ֻ��һ���߳�����
 * ȱ�㣺Ч�ʵ� ÿ���½�ʵ����Ҫ����ͬ������
 */
public class Wife3 {
	//δnew�½�ʵ��
	private static Wife3 wf3;
	private Wife3() {
	}
	//�жϼ��½� synchronized�����߳�ͬ��
	public static synchronized Wife3 getWife() {
		if(wf3==null) {
			wf3=new Wife3();
		}
		return wf3;
	}
}
