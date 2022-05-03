package Acmicpc.As.B4.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bałwanek8718 {
	static int[] arr = {7000, 3500, 1750};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]) * 1000;
		int k = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (k * arr[i] <= x) {
				res = arr[i]*k;
				break;
			}
		}
		System.out.println(res);
		br.close();
	}
}
