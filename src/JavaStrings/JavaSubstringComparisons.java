package JavaStrings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
		SortedSet<String> sets = new TreeSet<String>();
    for(int i=0;i<=s.length()-k;i++){
        sets.add(s.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
}
}
