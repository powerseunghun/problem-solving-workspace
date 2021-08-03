package Acmicpc.GreedyAlgorithm.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class WordMath1339 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), weight = 9, sum = 0;
		Integer[] val = new Integer[26];
		Arrays.fill(val, 0);
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0, w = tmp.length()-1; j < tmp.length(); j++, w--) {
				val[tmp.charAt(j)-'A'] += (int)Math.pow(10, w);
			}
		}
		Arrays.sort(val, Collections.reverseOrder());
		
		for (int i = 0; i < val.length; i++) {
			if (val[i] == 0) continue;
			sum += val[i] * weight--;
		}
		System.out.println(sum);
	}
}
