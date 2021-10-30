package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JMOS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N], lis = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.fill(lis, 1);
		max = lis[0];
		
		for (int i = 1; i < lis.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					lis[i] = Math.max(lis[i], lis[j]+1);
				}
			}
			max = Math.max(lis[i], max);
		}
		System.out.println(N - max);
	}
}
