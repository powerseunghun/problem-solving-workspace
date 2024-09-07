package Acmicpc.As.B3.ThirtyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingSublist30216 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 1, v = 0, max = Integer.MIN_VALUE;
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		v = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (v < arr[i]) {
				res++;
				v = arr[i];
				max = Math.max(max, res);
			}
			else {
				res = 1;
				v = arr[i];
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
