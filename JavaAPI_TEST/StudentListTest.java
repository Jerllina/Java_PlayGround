package JavaAPItest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class StudentListTest {
	//�����б����ڴ��ѧ����Ϣ
	//���Ϻ��<>������
	public List<Student> students;
	
	public StudentListTest() {
		this.students=new ArrayList<Student>();
	}
	//���б������ѧ��
	public void testAdd() {
		//����һ��ѧ������
		Student st1=new Student("1","A");
		//��ӵ��б���
		students.add(st1);
		//ȡ��List�е�Student����
		Student temp=students.get(0);
		System.out.println("�����ѧ����"+temp.id+" . "+temp.name);
		//��ͬ�������ѧ��2
        Student st2 = new Student("2", "B");
        students.add(0, st2);
        Student temp2 = students.get(0);
        System.out.println("�����ѧ����" + temp2.id + " . " + temp2.name);
        
        //�����������ʽ���
        Student[] student= {new Student("3","C"),new Student("4","D")};   
        
        //Arrays�ࣺ������������ĸ��ַ��� �����������ȣ�
        //asList()����������һ��ָ������֧�ֵĹ̶���С���б�
        students.addAll(Arrays.asList(student));
        Student temp3=students.get(2);
        Student temp4=students.get(3);
        System.out.println("�����ѧ����" + temp3.id + " . " + temp3.name);
        System.out.println("�����ѧ����" + temp4.id + " . " + temp4.name);
		
        Student[] student2 = { new Student("5", "E"), new Student("6", "F") };
        students.addAll(2, Arrays.asList(student2));
        Student temp5 = students.get(2);
        Student temp6 = students.get(3);
        System.out.println("�����ѧ����" + temp5.id + " . " + temp5.name);
        System.out.println("�����ѧ����" + temp6.id + " . " + temp6.name);

	}
    //ȡ��List��Ԫ�صķ���1
    public void testGet() {
    	int size=students.size();
    	for (int i=0;i<size;i++) {
    		Student st=students.get(i);
    		System.out.println("ѧ����" + st.id + " . " + st.name);
    	}
    }
    
    //ȡ��List��Ԫ�صķ���2
    //ͨ������������&ѡ�� ֻ�ܵ����ƶ�
    public void testIterator() {
    	Iterator<Student> it=students.iterator();
    	System.out.println("ͨ������������ ������ѧ����");
    	while (it.hasNext()) {
    		Student st=it.next();
    		System.out.println("ѧ����" + st.id + " . " + st.name);
    	}
    }
    //ȡ��List��Ԫ�صķ���3
    //ͨ��for each ��������
    public void testForEach() {
    	System.out.println("ͨ��for each���� ������ѧ����");
    	for (Student obj:students) {
    		Student st=obj;
    		System.out.println("ѧ����" + st.id + " . " + st.name);
    	}
    }
    //�޸�ListԪ��
    public void testModify() {
    	students.set(4, new Student("3","M"));
    }
    //ɾ��ListԪ��
    public void testRemove() {
    	Student st=students.get(4);
    	System.out.println("ѧ����" + st.id + " . " + st.name+"������ɾ��");
    	students.remove(st);
    	System.out.println("�ɹ�ɾ����");
    	testForEach();
    	
    }
    public static void main(String[] args) {
        StudentListTest lt = new StudentListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
        lt.testModify();
        lt.testForEach();
        lt.testRemove();
    }

}
