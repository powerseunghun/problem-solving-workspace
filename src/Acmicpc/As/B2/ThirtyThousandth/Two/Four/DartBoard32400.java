package Acmicpc.As.B2.ThirtyThousandth.Two.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DartBoard32400 {
	static final int l = 20;
	static int[] arr = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == l) idx = i;
		}
		System.out.println(arr[(idx+1)%l]+arr[(idx+l-1)%l] >= 12 ? "Alice" : "Bob");
		br.close();
	}
}
