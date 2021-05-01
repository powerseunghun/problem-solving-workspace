package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1080 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine()), sum = 0, i = 0;
		
		for (i = 1;; i++) {
			sum += i;
			if (sum >= target) break;
		}
		
		System.out.println(i);
	}
}
