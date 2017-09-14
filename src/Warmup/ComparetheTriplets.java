package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ComparetheTriplets {
	private static void add(int[] arr, Scanner scanner) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
	}



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int[] alice = new int[3];
		int[] bob = new int[3];
		add(alice,in);
		add(bob,in);
        int scoreAlice =0;
        int scoreBob =0;
        for(int i=0; i<alice.length;i++) {
        	if(alice[i]>bob[i]) {
        		scoreAlice++;
        	}else if(alice[i]<bob[i]) {
        		scoreBob++;
        	}
        }
        System.out.println(scoreAlice + " " + scoreBob);

	}
}
