import java.util.HashSet;
import java.util.Iterator;

public class hashsettest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		student st1 =new student("jianjian",67);
		student st2 =new student("tt",55);
		student st3 =new student("tt",55);
		student st4 =new student("tt",55);
		student st5 =new student("tt",55);		
		System.out.println(st3.hashCode());
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		set.add(st5);
	
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().hashCode());
			
		}
		System.out.println(set);
	}
}
