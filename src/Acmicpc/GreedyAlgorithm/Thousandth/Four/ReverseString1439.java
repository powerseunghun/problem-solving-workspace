package Acmicpc.GreedyAlgorithm.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int countZero = 0, countOne = 0;
		if (s.charAt(0) == '0') countZero++;
		else countOne++;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i-1) != s.charAt(i)) {
				if (s.charAt(i) == '0') countZero++;
				else countOne++;
			}
		}
		System.out.println(Math.min(countZero, countOne));
	}
}
