package JavaAPItest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


//课程管理类
public class MapTest {
	//课程类型对象
	public Map<String,Course> courses;
	//构造器中初始化courses属性
	public MapTest() {
		this.courses=new HashMap<String,Course>();
	}
	//测试添加课程 需先判断ID是否被占用
	public void testPut() {
		//获取输入课程ID和名称
		Scanner console=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("请输入课程ID：");
			String ID=console.next();
			//判断ID是否被占用
			Course cr=courses.get(ID);
			if(cr==null) {
				//提示输入课程名称
				System.out.println("请输入课程名称：");
				String name=console.next();
				//创建新课程对象
				Course newCourse=new Course(ID,name);
				//添加课程映射
				courses.put(ID,newCourse);
				System.out.println("成功添加课程："+courses.get(ID).name);
			}else {
				System.out.println("课程 ID 已被占用");
                continue;
			}
		}
	}
	//Map的keySet方法
	public void testKeySet() {
		//返回Map中所有键的Set集合
		Set<String> keySet=courses.keySet();
		//遍历keySet 取得每一个键 
		//调用get方法取得键对应的value
		for(String crID:keySet) {
			Course cr=courses.get(crID);
			if(cr!=null) {
				System.out.println("课程： " +cr.name);
			}
		}
	}
	//Map的映射删除
	public void testRemove() {
		//获取从键盘输入的待删除课程
		Scanner console=new Scanner(System.in);
		while(true) {
			//提示输入
			System.out.println("请输入需删除的课程ID：");
			String ID=console.next();
			//判断该ID是否有对应课程对象
			Course cr=courses.get(ID);
			if(cr==null) {
				//提示输入的ID并不存在
				System.out.println("课程 ID 不存在");
                continue;
			}
			courses.remove(ID);
			System.out.println("成功删除课程： "+cr.name);
			break;
		}
	}
	
	//entrySet方法遍历Map
	public void testEntrySet() {
		//返回Map中键值对
		Set<Entry<String,Course>> entrySet=courses.entrySet();
		for(Entry<String,Course> entry:entrySet) {
			System.out.println("取得键： "+entry.getKey());
			System.out.println("对应值： "+entry.getValue().name);
			
		}
	}
	
	//put方法修改已有映射
	public void testModify() {
		//提示输入
		System.out.println("请输入需修改的课程ID：");
		Scanner console=new Scanner(System.in);
		while(true) {
			
			String crID=console.next();
			//判断该ID是否有对应课程对象
			Course course=courses.get(crID);
			if(course==null) {
				//提示输入的ID并不存在
				System.out.println("课程 ID 不存在");
                continue;
			}
			System.out.println("当前课程ID所对应课程为： "+course.name);
			System.out.println("请输入新课程名称: ");
			String name=console.next();
			Course newCourse=new Course(crID,name);
			courses.put(crID, newCourse);
			System.out.println("修改成功");
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
