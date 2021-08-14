package Acmicpc.BruteForceAlgorithm.TwoThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ContinueNumber2635 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> maxList = new ArrayList<>(), tmp = null;
		int N = Integer.parseInt(br.readLine()), maxLength = Integer.MIN_VALUE;
		int val1 = 0, val2 = 0;
		
		for (int i = N; i > 0; i--) {
			tmp = new ArrayList<>();
			tmp.add(N);
			tmp.add(i);
			for (int j = 0, value = 0;; j++, value = 0) {
				val1 = tmp.get(j);
				val2 = tmp.get(j+1);
				value = val1 - val2;
				if (value < 0) break;
				tmp.add(value);
			}
			if (tmp.size() > maxLength) {
				maxList = tmp;
				maxLength = tmp.size();
			}
		}
		System.out.println(maxList.size());
		for (int i = 0; i < maxList.size(); i++) {
			System.out.print(maxList.get(i) + " ");
		}
	}
}
