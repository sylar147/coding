package 解决方案;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Solution7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i=0;i<arr.length/2;i++)
        {	int t;
        	t=arr[i];
        	arr[i]=arr[arr.length-1-i];
        	arr[arr.length-1-i]=t;
        	
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}