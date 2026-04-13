package Acmicpc.As.B2.ThirtyThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctDigits30167 {
	static boolean[] arr = null;
	static final int l = 10;
	static boolean func(int i) {
		arr = new boolean[l];
		while(i != 0) {
			if (arr[i%10]) {
				return false;
			}
			arr[i%10] = true;
			i/=10;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int l = Integer.parseInt(str.split(" ")[0]);
		int r = Integer.parseInt(str.split(" ")[1]), res = -1;
		
		for (int i = l; i <= r; i++) {
			if (func(i)) {
				res = i;
				break;
			}
		}
		System.out.println(res);
		br.close();
	}
}
