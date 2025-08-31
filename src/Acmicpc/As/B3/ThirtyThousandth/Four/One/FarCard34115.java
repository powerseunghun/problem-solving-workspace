package Acmicpc.As.B3.ThirtyThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FarCard34115 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N+1];

		for (int i = 1; i <= N*2; i++) {
			v = Integer.parseInt(st.nextToken());
			arr[v] = arr[v] != 0 ? arr[v]+i : arr[v]-i;
		}
		
		for (int el : arr) {
			max = Math.max(el, max);
		}
		
		System.out.println(max-1);
		br.close();
	}
}
