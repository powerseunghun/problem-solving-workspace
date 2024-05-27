package Acmicpc.As.B5.TwentyThousandth.Eight.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Киноманы28927 {
	static final int l = 2;
	static final int[] w = {3,20,120};
	static int[] arr = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w.length; j++) {
				arr[i] += Integer.parseInt(st.nextToken()) * w[j];
			}
		}
		
		System.out.println(arr[0]==arr[1] ? "Draw" : arr[0]>arr[1] ? "Max" : "Mel");
		br.close();
	}
}
