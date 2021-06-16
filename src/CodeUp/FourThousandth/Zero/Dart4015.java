package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Dart4015 {
	static int[] arr = new int[4];
	static Integer[] dart = new Integer[8];
	static int count = 0;
	static StringBuilder sb = null;
	static void bt(int n, int d, int id, int target) {
		if (n == d) {
			int sum = 0;
			sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				sb.append(arr[i] + " ");
			}
			if (sum == target) {
				count++;
				System.out.println(sb);
			}
			return;
		}
		
		for (int i = id; i < dart.length; i++) {
			arr[d] = dart[i];
			bt(n, d+1, i, target);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < dart.length; i++) {
			dart[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(dart, Collections.reverseOrder());
		int target = Integer.parseInt(br.readLine());
		
		bt(4, 0, 0, target);
		System.out.println(count);
	}
}
