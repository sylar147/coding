package 解决方案;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
    	ArrayList li =new ArrayList();
    	for(int x:nums){
    		if (!li.contains(x)){
    			li.add(x);
    		}
    	}

    	li.sort(new Comparator(){
    		@Override
    		public int compare(Object o1, Object o2) {
    			// TODO 自动生成的方法存根
    			return (int)o1>(int)o2?1:-1;
    		}
    	});
//    	System.out.println(li);
    	if(li.size()<3)return (int)li.get(li.size()-1);
    	else return (int) li.get(li.size()-3);
    	}
	}

