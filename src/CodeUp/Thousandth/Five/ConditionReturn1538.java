package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionReturn1538 {
	static void f(int n) {
		if (n % 2 == 0) System.out.println("even");
		else System.out.println("odd");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
