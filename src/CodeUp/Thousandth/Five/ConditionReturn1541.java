package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionReturn1541 {
	static boolean isPrime(int n) {
		boolean flag = false;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) count++;
		}
		
		if (count == 2) flag = true;
		
		return flag;
	}
	static void f(int n) {
		if (isPrime(n)) System.out.println("prime");
		else System.out.println("composite");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
