package Acmicpc.String.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindLieDownPlace1652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0, horizonCount = 0, verticalCount = 0;
		String[] strs = new String[N];
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
		}
		
		for (int i = 0; i < strs.length; i++) {
			count = 0;
			for (int j = 0; j < strs[i].length(); j++) {
				if (strs[i].charAt(j) == '.') {
					count++;
				}
				else {
					if (count >= 2) {
						horizonCount++;
					}
					count = 0;
				}
			}
			if (count >= 2) horizonCount++;
		}
		for (int i = 0; i < N; i++) {
			count = 0;
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].charAt(i) == '.') count++;
				else {
					if (count >= 2) {
						verticalCount++;
					}
					count = 0;
				}
			}
			if (count >= 2) verticalCount++;
		}
		System.out.println(horizonCount + " " + verticalCount);
	}
}
