package Acmicpc.As.B3.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SangKeunFriend5717 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int M = 0, F = 0;
		while (true) {
			tmp = br.readLine();
			M = Integer.parseInt(tmp.split(" ")[0]);
			F = Integer.parseInt(tmp.split(" ")[1]);
			if (M == 0 && F == 0) break;
			
			sb.append((M+F) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
