package Acmicpc.OrderSubmit.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Uphill2846 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[] arr = new int[N], arr2 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i-1]) {
				arr2[i] = arr2[i-1] + (arr[i]-arr[i-1]);
				max = Math.max(arr2[i], max);
			}
		}
		System.out.println(max);
		br.close();
	}
}
