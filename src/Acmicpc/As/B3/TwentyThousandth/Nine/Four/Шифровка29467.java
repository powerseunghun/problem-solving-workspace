package Acmicpc.As.B3.TwentyThousandth.Nine.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Шифровка29467 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), res = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (res.compareTo(str.substring(i, str.length())) < 0) {
				res = str.substring(i, str.length());
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
