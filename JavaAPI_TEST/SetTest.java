package JavaAPItest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//创建项目成员管理类
public class SetTest {
	public List<Student> students;
	public SetTest() {
		students=new ArrayList<Student>();
		
	}
	//添加学生
	//往列表中添加学生
	public void testAdd() {
		//创建一个学生对象
		Student st1=new Student("1","A");
		//添加到列表中
		students.add(st1);
		//相同方法添加学生2
        Student st2 = new Student("2", "B");
        students.add(0, st2);
        
        //对象数组的形式添加
        Student[] student= {new Student("3","C"),new Student("4","D")};   
        
        //Arrays类：包含操作数组的各种方法 （排序、搜索等）
        //asList()方法：返回一个指定数组支持的固定大小的列表
        students.addAll(Arrays.asList(student));
		
        Student[] student2 = { new Student("5", "E"), new Student("6", "F") };
        students.addAll(2, Arrays.asList(student2));

	}

    //通过for each 方法访问集合元素
    public void testForEach() {
    	System.out.println("通过for each访问 有如下学生：");
    	for (Student obj:students) {
    		Student st=(Student)obj;
    		System.out.println("学生：" + st.id + " . " + st.name);
    	}
    }

    	

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        PD pd=new PD("1","zz");
        System.out.println("请： "+pd.name+ "选择小组成员~");
        
        //创建Scanner对象 接受从键盘输入的学生ID
        Scanner console=new Scanner(System.in);
        
        for(int i=0;i<3;i++) {
        	System.out.println("请输入学生ID： ");
        	String studentID=console.next();
        	for(Student s:st.students) {
        		if(s.id.equals(studentID)) {
        			pd.students.add(s);
        		}
        	}
        }
        st.testForEachForSer(pd);
        //关闭Scanner对象
        console.close();
    }
    //打印输出所选学生
    //Set里遍历元素只能用 for each 和 iterator 
    //不能使用 get() 方法，因为它是无序的
    //而List 可查询具体索引的元素
    public void testForEachForSer(PD pd){
        for(Student s: pd.students) {
        System.out.println("选择了学生：" + s.id + " . " + s.name);
        }
    }

}
