package com.singletonpatterntest;
/*����4��˫�ؼ����� double check
 * volatile�ؼ���:��ֹ�������Զ��Ż����� ȱ�㣺ĳЩ�ϰ汾�޷�����
 */
public class Wife4 {
	//δnew�½�ʵ��   
	private volatile static Wife4 wf4;
	private Wife4() {
	}
	//�жϼ��½� ˫������ʵ��
	public static  Wife4 getWife() {
		//������1:�����Ϊ��ֱ�ӷ���ʵ������Ϊ���������һ��ͬ��
		if(wf4==null) {
			synchronized(Wife4.class) {
				//������2���̵߳�ͬ�� 
				if(wf4==null) {
					wf4=new Wife4();
				}
			}
		}
		return wf4;
	}
	
}
