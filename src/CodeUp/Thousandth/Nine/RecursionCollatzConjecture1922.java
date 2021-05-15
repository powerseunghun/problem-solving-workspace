package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionCollatzConjecture1922 {
	static int f(int n, int count) {
		count++;
		if (n == 1) return count;
		else {
			if (n % 2 == 0) return f(n/2, count);
			else return f(n * 3 + 1, count);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Integer.parseInt(br.readLine()), 0));
	}
}
