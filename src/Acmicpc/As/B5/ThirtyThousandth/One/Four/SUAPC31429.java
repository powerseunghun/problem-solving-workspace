package Acmicpc.As.B5.ThirtyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SUAPC31429 {
	static String[] arr = {
			"12 1600", "11 894", "11 1327", "10 1311", "9 1004", 
			"9 1178", "9 1357", "8 837", "7 1055", "6 556", "6 773"
	};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(arr[n-1]);
		br.close();
	}
}
