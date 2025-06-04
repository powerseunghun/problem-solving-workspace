package Acmicpc.As.B2.ThirtyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyCopy33963 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), str2 = null;
		int res = 0;
		
		while(true) {
			str2 = String.valueOf(Integer.parseInt(str)*2);
			if (str.length() != str2.length()) break;
			str = str2;
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
