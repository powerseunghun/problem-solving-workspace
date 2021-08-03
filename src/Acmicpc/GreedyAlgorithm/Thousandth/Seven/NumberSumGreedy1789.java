package Acmicpc.GreedyAlgorithm.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSumGreedy1789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		long sum = 0, n = 1;
		
		while (true) {
			sum += n;
			if (sum > S) break;
			n++;
		}
		System.out.println(--n);
	}
}
