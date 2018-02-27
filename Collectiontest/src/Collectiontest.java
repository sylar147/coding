import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Collectiontest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection c =new ArrayList();
		Collection c2 =new TreeSet();
		c.add(1);
		c.add("casd");
		c.add(true);
		Iterator it = c.iterator();
		while (it.hasNext()) {
//			type type = (type) it.nextElement();
//			it.next();
			System.out.println(it.next());
			
		}
//		for (int i=0;i<c.size();i++){
			
//			System.out.println(((ArrayList) c).get(i));			
//		}
			
	}

}
