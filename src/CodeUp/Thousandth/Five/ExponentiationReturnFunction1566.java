package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExponentiationReturnFunction1566 {
	static long f(int a, int b) {
		long res = a;
		if (b == 0) return 1;
		for (int i = 0; i < b-1; i++) {
			res *= a;
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(f(a, b));
	}
}
