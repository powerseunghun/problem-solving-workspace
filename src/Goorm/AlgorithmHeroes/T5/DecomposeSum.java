package Goorm.AlgorithmHeroes.T5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DecomposeSum {
	static int decompose(int n) {
		int sum = 1;
		while (n != 0) {
			sum *= n % 10;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int e = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		
		for (int i = s; i <= e; i++) {
			sum += decompose(i);
		}
		
		System.out.println(sum);
		br.close();
	}
}
