package 解决方案;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String m=Integer.toBinaryString(n);
        
        int countmax=0;
//        System.out.println(m);
        char[] ca=m.toCharArray();
//        System.out.println(ca[0]);
        for(int i=0;i<ca.length;i++){
        	
        	int count=0;
        	if(ca[i]==1){
        		System.out.println("xxx56");
        		for(int j=i;ca[j]==1&&j<ca.length;j++){
        			count++;
        			System.out.println("xxx56");
        	}
        		i=i+count;
        		if(count>countmax)countmax=count;
        	}
        	
        }
        System.out.println(countmax);
    }
}