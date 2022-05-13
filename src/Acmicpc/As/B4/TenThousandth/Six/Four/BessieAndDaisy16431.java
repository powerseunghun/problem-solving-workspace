package Acmicpc.As.B4.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BessieAndDaisy16431 {
	static int[] arr = new int[6];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int B = 0, D = 0;
		
		for (int i = 0, idx = 0; i < 3; i++) {
			tmp = br.readLine();
			arr[idx++] = Integer.parseInt(tmp.split(" ")[0]);
			arr[idx++] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		B = Math.max(Math.abs(arr[4]-arr[0]), Math.abs(arr[5]-arr[1]));
		D = Math.abs(arr[4]-arr[2]) + Math.abs(arr[5]-arr[3]);
		
		if (B < D) System.out.println("bessie");
		else if (B > D) System.out.println("daisy");
		else System.out.println("tie");
		
		br.close();
	}
}
