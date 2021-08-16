package Acmicpc.Sorting.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PassTheLog11497 {
	static int solution(int[] arr, int[] minArr) {
		int left = 0, right = arr.length-1, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) minArr[left++] = arr[i];
			else minArr[right--] = arr[i];
		}
		for (int i = 0; i < minArr.length; i++) {
			if (i == minArr.length-1) {
				max = Math.max(Math.abs(minArr[i]-minArr[0]), max);
			}
			else max = Math.max(Math.abs(minArr[i]-minArr[i+1]), max);
		}
		return max;
 	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = null, minArr = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			minArr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			sb.append(solution(arr, minArr)+"\n");
		}
		System.out.print(sb.toString());
	}
}
