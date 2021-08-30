package Acmicpc.BinarySearch.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget2512 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), tBudget = 0, budgetSum = 0;
		int l = 0, r = 0, m = 0, ans = 0;
		int[] budget = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < budget.length; i++) {
			budget[i] = Integer.parseInt(st.nextToken());
		}
		tBudget = Integer.parseInt(br.readLine());
		
		Arrays.sort(budget);
		
		r = budget[budget.length-1];
		while (l <= r) {
			m = (l+r)/2;
			budgetSum = 0;
			for (int i = 0; i < budget.length; i++) {
				budgetSum += budget[i] >= m ? m : budget[i];
			}
			if (budgetSum > tBudget) r = m-1;
			else {
				l = m+1;
				ans = m;
			}
		}
		System.out.println(ans);
	}
}
