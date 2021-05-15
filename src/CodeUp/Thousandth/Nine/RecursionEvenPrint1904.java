package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionEvenPrint1904 {
	static void f(int a, int b) {
		if (b < a) return;
		else {
			f(a, b-1);
			if (b % 2 != 0) {
				System.out.print(b + " ");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		f(a, b);
	}
}
