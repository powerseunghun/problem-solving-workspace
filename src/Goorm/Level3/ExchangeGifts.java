package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeGifts {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0, M = 0;
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			N = Long.parseLong(tmp.split(" ")[0]);
			M = Long.parseLong(tmp.split(" ")[1]);
			
			sb.append(Math.min(N/5, (N+M)/12) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
