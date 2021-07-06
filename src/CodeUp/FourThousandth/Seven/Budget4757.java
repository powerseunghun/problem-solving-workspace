package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget4757 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), totalBudget = 0, budget = 0;
		long budgetSum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		totalBudget = Integer.parseInt(br.readLine());
		
		int left = 0, right = arr[arr.length-1], mid = 0;
		while (left <= right) {
			mid = (left+right)/2;
			budgetSum = 0;
			for (int i = 0; i < arr.length; i++) {
				budgetSum += arr[i] >= mid ? mid : arr[i];
			}
			if (budgetSum > totalBudget) {
				right = mid-1;
			}
			else {
				left = mid+1;
				budget = mid;
			}
		}
		System.out.println(budget);
	}
}
