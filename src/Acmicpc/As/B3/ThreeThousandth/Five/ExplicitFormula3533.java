package Acmicpc.As.B3.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExplicitFormula3533 {
	static final int l = 10;
	static int[] arr = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < l-1; i++) {
			for (int j = i+1; j < l; j++) {
				res ^= (arr[i] | arr[j]);
			}
		}
		
		for (int i = 0; i < l-2; i++) {
			for (int j = i+1; j < l-1; j++) {
				for (int k = j+1; k < l; k++) {
					res ^= (arr[i] | arr[j] | arr[k]);
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
