package 类与对象;

/**
 * 
 * @author 11854
 *
 */
public class Person {
	String name;
	int age;
	int id;
	public Person(){
		
	}
	public Person(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
		// TODO 自动生成的构造函数存根		
	}
	public void eat() {
		System.out.println(name+"吃饭");
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return name+" "+age+" "+ id; 
	}
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//
//	}

}
