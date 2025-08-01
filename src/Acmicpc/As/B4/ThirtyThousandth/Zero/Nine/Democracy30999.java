package Acmicpc.As.B4.ThirtyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Democracy30999 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]), res = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			if (str.replaceAll("X","").length() > str.length()/2) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
