package Acmicpc.MatheMatics.SixThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GermanyLotto6603 {
	static int[] nums = null;
	static int[] arr = new int[6];
	static void bt(int n, int d, int sIdx) {
		if (d >= n) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = sIdx; i < nums.length; i++) {
			arr[d] = nums[i];
			bt(n, d+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = 0;
		while (true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			
			nums = new int[n];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			bt(6, 0, 0);
			System.out.println();
		}
	}
}
