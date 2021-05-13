package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumberCompare1754 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String s1 = tmp.split(" ")[0];
		String s2 = tmp.split(" ")[1];
		
		if (s1.length() != s2.length()) {
			if (s1.length() > s2.length()) System.out.println(s2 + " " + s1);
			else System.out.println(s1 + " " + s2);
		}
		else {
			if (s1.compareTo(s2) > 0) System.out.println(s2 + " " + s1);
			else System.out.println(s1 + " " + s2);
		}
		
	}
}
