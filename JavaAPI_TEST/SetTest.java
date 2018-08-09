package JavaAPItest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//������Ŀ��Ա������
public class SetTest {
	public List<Student> students;
	public SetTest() {
		students=new ArrayList<Student>();
		
	}
	//���ѧ��
	//���б������ѧ��
	public void testAdd() {
		//����һ��ѧ������
		Student st1=new Student("1","A");
		//��ӵ��б���
		students.add(st1);
		//��ͬ�������ѧ��2
        Student st2 = new Student("2", "B");
        students.add(0, st2);
        
        //�����������ʽ���
        Student[] student= {new Student("3","C"),new Student("4","D")};   
        
        //Arrays�ࣺ������������ĸ��ַ��� �����������ȣ�
        //asList()����������һ��ָ������֧�ֵĹ̶���С���б�
        students.addAll(Arrays.asList(student));
		
        Student[] student2 = { new Student("5", "E"), new Student("6", "F") };
        students.addAll(2, Arrays.asList(student2));

	}

    //ͨ��for each �������ʼ���Ԫ��
    public void testForEach() {
    	System.out.println("ͨ��for each���� ������ѧ����");
    	for (Student obj:students) {
    		Student st=(Student)obj;
    		System.out.println("ѧ����" + st.id + " . " + st.name);
    	}
    }

    	

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        PD pd=new PD("1","zz");
        System.out.println("�룺 "+pd.name+ "ѡ��С���Ա~");
        
        //����Scanner���� ���ܴӼ��������ѧ��ID
        Scanner console=new Scanner(System.in);
        
        for(int i=0;i<3;i++) {
        	System.out.println("������ѧ��ID�� ");
        	String studentID=console.next();
        	for(Student s:st.students) {
        		if(s.id.equals(studentID)) {
        			pd.students.add(s);
        		}
        	}
        }
        st.testForEachForSer(pd);
        //�ر�Scanner����
        console.close();
    }
    //��ӡ�����ѡѧ��
    //Set�����Ԫ��ֻ���� for each �� iterator 
    //����ʹ�� get() ��������Ϊ���������
    //��List �ɲ�ѯ����������Ԫ��
    public void testForEachForSer(PD pd){
        for(Student s: pd.students) {
        System.out.println("ѡ����ѧ����" + s.id + " . " + s.name);
        }
    }

}
