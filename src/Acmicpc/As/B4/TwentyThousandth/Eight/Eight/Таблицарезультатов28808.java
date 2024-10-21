package Acmicpc.As.B4.TwentyThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Таблицарезультатов28808 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().split(" ")[0]), res = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			res = str.contains("+") ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
