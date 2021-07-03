package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue4591 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0, idx = 0;
		for (int i = 0, val = 0; i < 9; i++) {
			val = Integer.parseInt(br.readLine());
			if (val >= max) {
				max = val;
				idx = i+1;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
