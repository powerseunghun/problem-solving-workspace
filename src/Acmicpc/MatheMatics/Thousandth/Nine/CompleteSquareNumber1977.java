package Acmicpc.MatheMatics.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompleteSquareNumber1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0, min = Integer.MAX_VALUE;
		boolean flag = false;
		for (int i = M; i <= N; i++) {
			if ((int)Math.sqrt(i) == Math.sqrt(i)) {
				flag = true;
				sum += i;
				min = Math.min(min, i);
			}
		}
		if (!flag) {
			System.out.println("-1");
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
