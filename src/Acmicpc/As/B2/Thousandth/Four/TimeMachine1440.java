package Acmicpc.As.B2.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TimeMachine1440 {
	static boolean[] check = new boolean[3];
	static int[] nums = new int[3];
	static int[] arr = new int[3];
	static int res = 0;
	static boolean calc() {
		for (int i = 0, f1 = 0, f2 = 0; i < arr.length; i++) {
			f1 = i == 0 ? 1 : 0;
			f2 = i == 0 ? 12 : 59;
			if (!(arr[i] >= f1 && arr[i] <= f2)) {
				return false;
			}
		}
		return true;
	}
	static void func(int n, int d) {
		if (d >= n) {
			res += calc() ? 1 : 0;
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!check[i]) {
				arr[d] = nums[i];
				check[i] = true;
				func(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int idx = 0;
		while (st.hasMoreTokens()) {
			nums[idx++] = Integer.parseInt(st.nextToken());
		}
		func(arr.length, 0);
		
		System.out.println(res);
		br.close();
	}
}
