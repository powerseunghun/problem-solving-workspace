package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionReturn1539 {
	static void f(int n) {
		switch(n) {
		case 0:
			System.out.println("false");
			break;
		default:
			System.out.println("true");
			break;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
