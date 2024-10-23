package Acmicpc.As.B4.ThirtyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Osúltimosserãoosprimeiros30658 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			for (int i = arr.length-1; i >= 0; i--) {
				sb.append(arr[i]).append("\n");
			}
			sb.append("0\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
