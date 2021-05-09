package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterationPrintFunction1544 {
	static void f(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
