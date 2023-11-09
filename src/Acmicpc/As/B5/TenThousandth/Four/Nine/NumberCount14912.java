package Acmicpc.As.B5.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCount14912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), tStr = null;
		int N = Integer.parseInt(str.split(" ")[0]);
		int d = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		for (int i = 1; i <= N; i++) {
			if (!String.valueOf(i).contains(String.valueOf(d))) continue;
			tStr = String.valueOf(i);
			res += Math.abs(tStr.length()-tStr.replaceAll(String.valueOf(d), "").length()); 
		}
		
		System.out.println(res);
		br.close();
	}
}
