package JavaAPItest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


//�γ̹�����
public class MapTest {
	//�γ����Ͷ���
	public Map<String,Course> courses;
	//�������г�ʼ��courses����
	public MapTest() {
		this.courses=new HashMap<String,Course>();
	}
	//������ӿγ� �����ж�ID�Ƿ�ռ��
	public void testPut() {
		//��ȡ����γ�ID������
		Scanner console=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("������γ�ID��");
			String ID=console.next();
			//�ж�ID�Ƿ�ռ��
			Course cr=courses.get(ID);
			if(cr==null) {
				//��ʾ����γ�����
				System.out.println("������γ����ƣ�");
				String name=console.next();
				//�����¿γ̶���
				Course newCourse=new Course(ID,name);
				//��ӿγ�ӳ��
				courses.put(ID,newCourse);
				System.out.println("�ɹ���ӿγ̣�"+courses.get(ID).name);
			}else {
				System.out.println("�γ� ID �ѱ�ռ��");
                continue;
			}
		}
	}
	//Map��keySet����
	public void testKeySet() {
		//����Map�����м���Set����
		Set<String> keySet=courses.keySet();
		//����keySet ȡ��ÿһ���� 
		//����get����ȡ�ü���Ӧ��value
		for(String crID:keySet) {
			Course cr=courses.get(crID);
			if(cr!=null) {
				System.out.println("�γ̣� " +cr.name);
			}
		}
	}
	//Map��ӳ��ɾ��
	public void testRemove() {
		//��ȡ�Ӽ�������Ĵ�ɾ���γ�
		Scanner console=new Scanner(System.in);
		while(true) {
			//��ʾ����
			System.out.println("��������ɾ���Ŀγ�ID��");
			String ID=console.next();
			//�жϸ�ID�Ƿ��ж�Ӧ�γ̶���
			Course cr=courses.get(ID);
			if(cr==null) {
				//��ʾ�����ID��������
				System.out.println("�γ� ID ������");
                continue;
			}
			courses.remove(ID);
			System.out.println("�ɹ�ɾ���γ̣� "+cr.name);
			break;
		}
	}
	
	//entrySet��������Map
	public void testEntrySet() {
		//����Map�м�ֵ��
		Set<Entry<String,Course>> entrySet=courses.entrySet();
		for(Entry<String,Course> entry:entrySet) {
			System.out.println("ȡ�ü��� "+entry.getKey());
			System.out.println("��Ӧֵ�� "+entry.getValue().name);
			
		}
	}
	
	//put�����޸�����ӳ��
	public void testModify() {
		//��ʾ����
		System.out.println("���������޸ĵĿγ�ID��");
		Scanner console=new Scanner(System.in);
		while(true) {
			
			String crID=console.next();
			//�жϸ�ID�Ƿ��ж�Ӧ�γ̶���
			Course course=courses.get(crID);
			if(course==null) {
				//��ʾ�����ID��������
				System.out.println("�γ� ID ������");
                continue;
			}
			System.out.println("��ǰ�γ�ID����Ӧ�γ�Ϊ�� "+course.name);
			System.out.println("�������¿γ�����: ");
			String name=console.next();
			Course newCourse=new Course(crID,name);
			courses.put(crID, newCourse);
			System.out.println("�޸ĳɹ�");
			break;
		}
	}
	
	public static void main(String[] args) {
		MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        mt.testRemove();
        mt.testModify();
        mt.testEntrySet();

	}
}
