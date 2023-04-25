package Acmicpc.As.B3.TwentyThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RatingProblems21146 {
	static final int maxRate = 3;
	static final int minRate = -3;
	static double func(double sum, int n, int k, int rate) {
		return (sum + ((n-k) * rate)) / n;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		double sum = 0;
		
		for (int i = 0; i < k; i++) {
			sum += Double.parseDouble(br.readLine());
		}
		
		System.out.println(func(sum, n, k, minRate) + " " + func(sum, n, k, maxRate));
		br.close();
	}
}
