package Acmicpc.GreedyAlgorithm.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverWatch14659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, val = 0; i < arr.length-1; i++, val = 0) {
			for (int j = i+1; j < arr.length; j++) {
				if (!(arr[i] > arr[j])) break;
				val++;
			}
			ans = Math.max(ans, val);
		}
		System.out.println(ans);
	}
}
