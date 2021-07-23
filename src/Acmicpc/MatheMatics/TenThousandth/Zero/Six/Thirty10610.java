package Acmicpc.MatheMatics.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Thirty10610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int[] nums = new int[10];
		int digitSum = 0;
		
		Arrays.fill(nums, 0);
		for (int i = 0, val = 0; i < str.length(); i++) {
			val = str.charAt(i) - '0';
			nums[val]++;
			digitSum += val;
		}
		if (!str.contains("0") || digitSum % 3 != 0) {
			System.out.println("-1");
			return;
		}
		
		for (int i = nums.length-1; i >= 0; i--) {
			if (nums[i] == 0) continue;
			for (int j = 0; j < nums[i]; j++) {
				sb.append(i);
			}
		}
		System.out.println(sb.toString());
	}
}
