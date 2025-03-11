package Acmicpc.As.B2.TenThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AreTheyAllIntegers18141 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag = true;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (i == j || j == k || k == i) continue;
					if ((arr[i]-arr[j]) % arr[k] != 0) {
						flag = false;
					}
				}
			}
		}
		
		System.out.println(flag ? "yes" : "no");
		br.close();
	}
}
