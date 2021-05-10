package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinFunction1579 {
	static int myMin(int a, int b) {
		return a >= b ? b : a;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(myMin(a, b));
	}
}
