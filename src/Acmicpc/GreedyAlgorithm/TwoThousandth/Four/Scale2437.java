package Acmicpc.GreedyAlgorithm.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale2437 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		sum += arr[0];
		if (sum != 1) {
			System.out.println("1");
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > sum + 1) break;
			sum += arr[i];
		}
		System.out.println(sum+1);
	}
}
