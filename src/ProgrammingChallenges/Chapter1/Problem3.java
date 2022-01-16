package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Problem3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer[] arr = null, divArr = null;
		int n = 0, sum = 0, tmp = 0, money = 0;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			// initialize space ----
			arr = new Integer[n];
			divArr = new Integer[n];
			sum = 0;
			money = 0;
			// initialize space ----
			for (int i = 0; i < n; i++) {
				arr[i] = (int)(Double.parseDouble(br.readLine()) * 100 + 0.5);
				sum += arr[i];
			}
			tmp = sum % n;
			sum /= n;
			
			Arrays.sort(arr, Collections.reverseOrder());
			
			for (int i = 0; i < divArr.length; i++) {
				divArr[i] = sum;
			}
			for (int i = 0; i < tmp; i++) {
				divArr[i]++;
			}
			for (int i = 0; i < arr.length; i++) {
				money += Math.abs(arr[i] - divArr[i]);
			}
			
			sb.append(String.format("%.2f\n", money/2/100.0));
		}
		System.out.print(sb.toString());
		br.close();
	}
}
