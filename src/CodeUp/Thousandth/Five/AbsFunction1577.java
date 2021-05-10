package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsFunction1577 {
	static int myAbs(int n) {
		return n <= 0 ? n * -1 : n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(myAbs(Integer.parseInt(br.readLine())));
	}
}
