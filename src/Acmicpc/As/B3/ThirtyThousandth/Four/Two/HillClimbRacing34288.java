package Acmicpc.As.B3.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HillClimbRacing34288 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		boolean flag = true;
		int l = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1]);
		arr = new int[l+1];
		str = br.readLine();
		
		for (int i = 0; i < str.split(" ").length; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]-arr[i-1] > a) {
				flag = false;
			}
		}
		
		System.out.println(flag ? "POSSIBLE" : "BUG REPORT");
		br.close();
		
	}
}
