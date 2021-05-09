package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsImplFunction1549 {
	static long abs(long n) {
		return (long) Math.abs(n);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(abs(Long.parseLong(br.readLine())));
	}
}
