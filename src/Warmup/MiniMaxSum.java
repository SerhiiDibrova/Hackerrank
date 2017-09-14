package Warmup;
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
public class MiniMaxSum {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long sum =0;
        for(int i=0; i < 5;  i++){
            arr[ i] = in.nextInt();
            sum = sum+arr[i];
        }
        
        long min =Long.MAX_VALUE;
        long max =Long.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
			long fourSum = sum - arr[i];
			
			min = Math.min(fourSum, min);
			max = Math.max(fourSum, max);
		}
		System.out.println(min + " " + max);
	}

}
