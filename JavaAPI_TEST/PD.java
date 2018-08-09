package JavaAPItest;

import java.util.HashSet;
import java.util.Set;

//创建项目组长类
public class PD {
	public String id;
	public String name;
	
	public Set<Student> students;
	public PD(String id,String name) {
		this.id=id;
		this.name=name;
		this.students=new HashSet<Student>();
	}
}
