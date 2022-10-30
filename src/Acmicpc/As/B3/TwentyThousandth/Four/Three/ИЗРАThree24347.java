package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ИЗРАThree24347 {
	static long max = Long.MIN_VALUE;
	static long[] nums = new long[3];
	static long[] arr = new long[3];
	static boolean[] check = new boolean[3];
	static String[] ops = {"+", "-", "*"};
	static String[] opsArr = new String[2];
	static Set<String> set = new HashSet<>();
	static void dfs(int n, int d) {
		if (d >= n) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				if (i == arr.length-1) continue;
				sb.append(",");
			}
			set.add(sb.toString());
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!check[i]) {
				arr[d] = nums[i];
				check[i] = true;
				dfs(n, d+1);
				check[i] = false;
			}
		}
	}
	static void func(int n, int d) {
		if (d >= n) {
			for (String str : set) {
				String[] strs = str.split(",");
				long tmpVal = 0;
				System.out.println("str : " + str);
				for (int i = 0; i < opsArr.length; i++) {
					System.out.print(opsArr[i] + " ");
					switch(opsArr[i]) {
					case "+":
						tmpVal = tmpVal == 0 ? Long.parseLong(strs[i]) + Long.parseLong(strs[i+1]) : tmpVal + Long.parseLong(strs[i+1]);
						break;
					case "-":
						tmpVal = tmpVal == 0 ? Long.parseLong(strs[i]) - Long.parseLong(strs[i+1]) : tmpVal - Long.parseLong(strs[i+1]);
						break;
					case "*":
						tmpVal = tmpVal == 0 ? Long.parseLong(strs[i]) * Long.parseLong(strs[i+1]) : tmpVal * Long.parseLong(strs[i+1]);
						break;
					}
				}
				max = Math.max(max, tmpVal);
			}
			return;
		}
		
		for (int i = 0; i < ops.length; i++) {
			if (!check[i]) {
				check[i] = true;
				opsArr[d] = ops[i];
				func(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Long.parseLong(tmp.split(" ")[i]);
		}
		
		dfs(3, 0);
		Arrays.fill(check, false);
		func(2, 0);
		
		System.out.println(max);
		br.close();
	}
}
