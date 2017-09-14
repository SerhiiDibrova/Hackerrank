package ThirtyDaysofCode;

import java.util.Scanner;

public class Day03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)

		if (n % 2 == 1 || (n > 5 && n < 21))
			System.out.println("Weird");
		else
			System.out.println("Not Weird");
	}
}
