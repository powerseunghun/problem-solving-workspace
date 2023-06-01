package Acmicpc.As.B2.TwentyThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Candy28062 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i] % 2 == 0) {
				res += arr[i];
			}
			else {
				if (v == 0) {
					v = arr[i];
				}
				else {
					res += arr[i] + v;
					v = 0;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
