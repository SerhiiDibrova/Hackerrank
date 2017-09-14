package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class PlusMinus {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();

	int positive = 0;
	int negative = 0;
	int zero = 0;
	for (int i = 0; i < N; i++) {
		final int n = scanner.nextInt();
		if (n > 0) {
			positive++;
		} else if (n < 0) {
			negative++;
		} else {
			zero++;
		}
	}
	System.out.println(positive / ((double) N));
	System.out.println(negative / ((double) N));
	System.out.println(zero / ((double) N));
}
}


