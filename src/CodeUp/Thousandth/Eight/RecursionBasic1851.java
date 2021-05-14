package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionBasic1851 {
	static void print(int n) {
		if (n == 1) {
			System.out.print("*");
			return;
		}
		else {
			System.out.print("*");
			print(n-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		print(Integer.parseInt(br.readLine()));
	}
}
