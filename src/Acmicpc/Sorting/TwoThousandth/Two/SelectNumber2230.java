package Acmicpc.Sorting.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectNumber2230 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]);
		int left = 0, right = 0, min = Integer.MAX_VALUE, val = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		while (left < N && right < N) {
			val = Math.abs(arr[right]-arr[left]);
			if (val >= M) {
				min = Math.min(min, val);
				left++;
			}
			else right++;
		}
		System.out.println(min);
	}
}
