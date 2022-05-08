package Acmicpc.As.B4.TenThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EverySecondCounts15080 {
	static int[] arr1 = new int[3];
	static int[] arr2 = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int sum = 0, w = 0;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(), " :");
			for (int j = 0; j < arr1.length; j++) {
				if (i == 0) {
					arr1[j] = Integer.parseInt(st.nextToken());
				}
				else {
					arr2[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		for (int i = arr1.length-1, diff = 0; i >= 0; i--) {
			diff = arr2[i] - arr1[i];
			if (diff < 0) {
				diff += i == 0 ? 24 : 60;
				if (i != 0) arr2[i-1]--;
			}
			sum += diff * Math.pow(60, w++);
		}
		
		System.out.println(sum);
		br.close();
	}
}
