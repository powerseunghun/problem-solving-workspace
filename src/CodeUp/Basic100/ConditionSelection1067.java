package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionSelection1067 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n < 0) {
			System.out.println("minus");
		}
		else {
			System.out.println("plus");
		}
		
		if (n % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}
