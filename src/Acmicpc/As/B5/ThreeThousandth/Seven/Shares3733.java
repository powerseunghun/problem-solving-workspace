package Acmicpc.As.B5.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shares3733 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0, S = 0;
		String str = null;
		
		while ((str = br.readLine()) != null) {
			N = Integer.parseInt(str.split(" ")[0]);
			S = Integer.parseInt(str.split(" ")[1]);
			
			sb.append((S/(N+1)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
