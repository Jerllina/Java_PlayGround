package JavaAPItest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class StudentListTest {
	//创建列表用于存放学生信息
	//集合后的<>代表泛型
	public List<Student> students;
	
	public StudentListTest() {
		this.students=new ArrayList<Student>();
	}
	//往列表中添加学生
	public void testAdd() {
		//创建一个学生对象
		Student st1=new Student("1","A");
		//添加到列表中
		students.add(st1);
		//取出List中的Student对象
		Student temp=students.get(0);
		System.out.println("添加了学生："+temp.id+" . "+temp.name);
		//相同方法添加学生2
        Student st2 = new Student("2", "B");
        students.add(0, st2);
        Student temp2 = students.get(0);
        System.out.println("添加了学生：" + temp2.id + " . " + temp2.name);
        
        //对象数组的形式添加
        Student[] student= {new Student("3","C"),new Student("4","D")};   
        
        //Arrays类：包含操作数组的各种方法 （排序、搜索等）
        //asList()方法：返回一个指定数组支持的固定大小的列表
        students.addAll(Arrays.asList(student));
        Student temp3=students.get(2);
        Student temp4=students.get(3);
        System.out.println("添加了学生：" + temp3.id + " . " + temp3.name);
        System.out.println("添加了学生：" + temp4.id + " . " + temp4.name);
		
        Student[] student2 = { new Student("5", "E"), new Student("6", "F") };
        students.addAll(2, Arrays.asList(student2));
        Student temp5 = students.get(2);
        Student temp6 = students.get(3);
        System.out.println("添加了学生：" + temp5.id + " . " + temp5.name);
        System.out.println("添加了学生：" + temp6.id + " . " + temp6.name);

	}
    //取出List中元素的方法1
    public void testGet() {
    	int size=students.size();
    	for (int i=0;i<size;i++) {
    		Student st=students.get(i);
    		System.out.println("学生：" + st.id + " . " + st.name);
    	}
    }
    
    //取出List中元素的方法2
    //通过迭代器遍历&选择 只能单向移动
    public void testIterator() {
    	Iterator<Student> it=students.iterator();
    	System.out.println("通过迭代器访问 有如下学生：");
    	while (it.hasNext()) {
    		Student st=it.next();
    		System.out.println("学生：" + st.id + " . " + st.name);
    	}
    }
    //取出List中元素的方法3
    //通过for each 方法访问
    public void testForEach() {
    	System.out.println("通过for each访问 有如下学生：");
    	for (Student obj:students) {
    		Student st=obj;
    		System.out.println("学生：" + st.id + " . " + st.name);
    	}
    }
    //修改List元素
    public void testModify() {
    	students.set(4, new Student("3","M"));
    }
    //删除List元素
    public void testRemove() {
    	Student st=students.get(4);
    	System.out.println("学生：" + st.id + " . " + st.name+"即将被删除");
    	students.remove(st);
    	System.out.println("成功删除！");
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
