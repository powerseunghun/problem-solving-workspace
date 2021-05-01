package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1086 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 1; ; i++) {
			sum += i;
			if (sum >= n) break;
		}
		
		System.out.println(sum);
	}
}
