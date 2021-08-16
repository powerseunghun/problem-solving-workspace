package Acmicpc.Sorting.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jumong1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
		int left = 0, right = N-1, count = 0;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		while (left < right) {
			if (arr[left] + arr[right] == M) {
				left++;
				right--;
				count++;
			}
			else if (arr[left] + arr[right] < M) left++;
			else if (arr[left] + arr[right] > M) right--;
		}
		System.out.println(count);
	}
}
