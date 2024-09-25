package Acmicpc.As.B2.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Friendless16171 {
	static boolean func(String str, String K) {
		for (int i = 0; i < str.length()-K.length()+1; i++) {
			if (str.substring(i, K.length()+i).equals(K)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replaceAll("[^a-z|A-Z]", "");
		String K = br.readLine();
		
		System.out.println(func(str, K) ? "1" : "0");
		br.close();
	}
}
