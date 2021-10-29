package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum {
	static int decompositionMultiple(int n) {
		int mul = 1;
		while (n != 0) {
			mul *= n%10;
			n /= 10;
		}
		return mul;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		for (int i = A; i <= B; i++) {
			sum += decompositionMultiple(i);
		}
		
		System.out.println(sum);
	}
}
