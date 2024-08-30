package Acmicpc.As.B3.ThirtyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElevatorDepth32193 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), A = 0, B = 0;
		String str = null;
		arr1 = new int[N];
		arr2 = new int[N];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			A = Integer.parseInt(str.split(" ")[0]);
			B = Integer.parseInt(str.split(" ")[1]);
			arr1[i] = A;
			arr2[i] = B;
			if (i == 0) continue;
			arr1[i] += arr1[i-1];
			arr2[i] += arr2[i-1];
		}
		
		for (int i = 0; i < arr1.length; i++ ) {
			sb.append(arr1[i]-arr2[i]).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
