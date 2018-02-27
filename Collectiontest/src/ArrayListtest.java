import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListtest {
	public ArrayListtest() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
	List list = new ArrayList();
	Set set = new HashSet();
	list.add(1);
	list.add(2);
	list.add(6);
	list.add(4);
	set.add(2);
	set.add(1);
	set.add(5);
	set.add(6);
	set.add(3);
	set.add(3);
	Iterator it1 = list.iterator();
//	Iterator it1 = list.iterator();
	Iterator it2 = set.iterator();
	while(it2.hasNext()){
		System.out.print(it2.next());
	}
}
}
