package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       long sum = 0;
       
       for(int i = 0; i < n; i++){
           sum += in.nextLong();
       }
       
       System.out.print(sum);
}
}
