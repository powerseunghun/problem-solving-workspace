package Acmicpc.As.B3.ThirtyThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GahuiAndSousenkyo30792 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = 1, v = 0, res = 0;
		int[] arr = new int[N];
		v = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0] = v;
		
		while(st.hasMoreTokens()) {
			arr[idx++] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == v) res = i;
		}
		
		System.out.println(N-res);
		br.close();
	}
}
