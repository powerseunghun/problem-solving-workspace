package Acmicpc.As.S5.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PLAYERJINAHBOTTLEGROUNDS15803 {
	static int[] arr = new int[6];
	static int func() {
		int res = arr[0]*arr[3] + arr[2]*arr[5] + arr[4]*arr[1];
		return res -= arr[1]*arr[2] + arr[3]*arr[4] + arr[5]*arr[0];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		for (int i = 0; i < arr.length; i+= 2) {
			str = br.readLine();
			arr[i] = Integer.parseInt(str.split(" ")[0]);
			arr[i+1] = Integer.parseInt(str.split(" ")[1]);
		}
		int res = func();
		
		System.out.println(res == 0 ? "WHERE IS MY CHICKEN?" : "WINNER WINNER CHICKEN DINNER!");
		br.close();
	}
}
