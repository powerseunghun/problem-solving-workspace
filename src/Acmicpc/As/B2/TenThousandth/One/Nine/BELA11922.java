package Acmicpc.As.B2.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BELA11922 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]), res = 0;
		String B = str.split(" ")[1], K = null, S = null;
		
		for (int i = 0; i < N*4; i++) {
			str = br.readLine();
			K = String.valueOf(str.charAt(0));
			S = String.valueOf(str.charAt(1));
			switch(K) {
			case "A":
				res += 11;
				break;
			case "K":
				res += 4;
				break;
			case "Q":
				res += 3;
				break;
			case "J":
				res += S.equals(B) ? 20 : 2;
				break;
			case "T":
				res += 10;
				break;
			case "9":
				res += S.equals(B) ? 14 : 0;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
