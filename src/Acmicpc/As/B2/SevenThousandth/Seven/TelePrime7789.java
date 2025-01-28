package Acmicpc.As.B2.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TelePrime7789 {
	static boolean func(int n) {
		if (n == 1) return false;
		for (int i = 2; i*i <= n; i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n1 = Integer.parseInt(str.split(" ")[0]);
		int n2 = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(func(n1) && func(n2*1000000+n1) ? "Yes" : "No");
		br.close();
	}
}
