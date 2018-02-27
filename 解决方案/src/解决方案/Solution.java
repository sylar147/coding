package 解决方案;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public int reverse(int x) {
    	Stack<Character> sta=new Stack<Character>();
    	if (x!=0){
    		String sx=String.valueOf(x);
    		char[] sxchar=sx.toCharArray();
    		for(char cha:sxchar){
    			if (cha=='-'){
    				continue;
    			}
    			if (cha!='0'){
    				sta.push(cha);
    			}	
    		}
    		
    	}
    	String res="";
    	for (int i=0;i<sta.size();i++)res+=sta.pop();
        int resu=Integer.parseInt(res);
        
		return x>0?resu:(0-resu);
        
    }

    public static void main(String[] args) {
		Solution s = new Solution();
		int[] num ={1,1,2,3,3,4,4,8,8};
	
//		int[] args2 = new int[args.length + num.length];
//		System.arraycopy(args, 0, args2, 0, args.length);
//		System.arraycopy(num, 0, args2, args.length, num.length);
	}
}
