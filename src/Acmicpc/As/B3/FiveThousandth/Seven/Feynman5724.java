package Acmicpc.As.B3.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Feynman5724 {
	static int[] arr = new int[101];
	static void init() {
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = (int)(arr[i-1]+Math.pow(i, 2));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int N = 0;
		init();
		
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			sb.append(arr[N] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
