package Acmicpc.As.B1.TenThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence10539 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), s = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr1 = new int[N];
		arr2 = new int[N];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr1[i] = arr2[i] * (i+1) - s;
			s += arr1[i];
		}
		for (int el : arr1) {
			sb.append(el).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
