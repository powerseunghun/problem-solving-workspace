package Acmicpc.GreedyAlgorithm.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameDongJun2847 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = arr.length-2, val = 0; i >= 0; i--) {
			if (arr[i] >= arr[i+1]) {
				val = arr[i+1]-1;
				count += arr[i] - val;
				arr[i] = val;
			}
		}
		System.out.println(count);
	}
}
