package �������;

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
		// TODO �Զ����ɵĹ��캯�����		
	}
	public void eat() {
		System.out.println(name+"�Է�");
	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return name+" "+age+" "+ id; 
	}
//	public static void main(String[] args) {
//		// TODO �Զ����ɵķ������
//
//	}

}
