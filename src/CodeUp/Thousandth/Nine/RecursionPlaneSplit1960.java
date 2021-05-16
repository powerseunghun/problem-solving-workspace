package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPlaneSplit1960 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// can't recursion ... O(1)
		// -> for recursion ver
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tmp = ((n-1) * (2 * 2 + (n-2)))/2;
		System.out.println((2 + tmp) % 137);
	}
}
