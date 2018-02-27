package 类与对象;

import java.util.ArrayList;

public class test {
    public int strangePrinter(String s) {
        char a=s.charAt(0);
        ArrayList<Character> list=new ArrayList<Character>();
        list.add(a);
        int count=1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==a){continue;}
            else{
                a=s.charAt(i);
                if (!list.contains(a)){
                    count++;
                    list.add(a);
                }
                else{
                    continue;
                }
            }
        }
        return count;
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		test t= new test();
		int a=t.strangePrinter("aba");
		System.out.println(a);
		
//		System.out.println(tang);
	}

}
