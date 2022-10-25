package Acmicpc.As.B4.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideTheCash25858 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int p = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			sb.append((int)(p * (double)arr[i]/sum) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
