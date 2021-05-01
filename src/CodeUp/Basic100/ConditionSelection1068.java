package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionSelection1068 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n >= 90) {
			System.out.println("A");
		}
		else if (n >= 70) {
			System.out.println("B");
		}
		else if (n >= 40) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
}
