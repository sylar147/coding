import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
class student implements Comparable{
	String name;
	int score;
	public student(String name,int score) {
		// TODO 自动生成的构造函数存根
		this.name = name;
		this.score=score;

	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return name+"get"+score+"points";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		if(this==obj)return true;
		if (obj instanceof student) {
			student stu = (student) obj;
			if ((stu.score==this.score)&&(stu.name==this.name)){
				return true;
			}
			
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO 自动生成的方法存根
		return score/10;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		student stu=(student) o;
		if (this.score<stu.score)return 1;
		else return -1;
//		return 0;
	}
}
class person{
	int age;
	public person(int age) {
		// TODO 自动生成的构造函数存根
		this.age=age;
	}
}
public class sortedsettest {
	public static void main(String[] args) {
		SortedSet set= new TreeSet();
		person p1=new person(30);
		person p2=new person(20);
		person p3=new person(10);
		person p4=new person(40);
//		student s1 =new student("尖尖",59);
//		student s2 =new student("糖糖",69);
//		student s3 =new student("梦露",40);
//		student s4 =new student("大神",99);
//		student s5 =new student("尖尖",59);
//		set.add(s1);
//		set.add(s2);
//		set.add(s3);
//		set.add(s4);
//		set.add(s5);
		Iterator is = set.iterator();
		while (is.hasNext()) {
//			 object = () is.next();
			System.out.println(is.next());
			
		}
	}
}
