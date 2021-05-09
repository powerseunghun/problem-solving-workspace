package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionReturn1545 {
	static boolean f(int n) {
		if (n == 0) return true;
		else return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(f(Integer.parseInt(br.readLine()))) System.out.println("zero");
		else System.out.println("non zero");
	}
}
