package Acmicpc.MatheMatics.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumber2576 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = 0, sum = 0, min = Integer.MAX_VALUE;
		boolean flag = false;
		for (int i = 0; i < 7; i++) {
			val = Integer.parseInt(br.readLine());
			if (val % 2 != 0) {
				flag = true;
				sum += val;
				min = Math.min(min, val);
			}
		}
		if (flag) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
	}
}
