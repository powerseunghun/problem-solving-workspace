package Acmicpc.As.B3.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedLimit14541 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, s = 0, t = 0, sum = 0;
		String tmp = null;
		
		while(true) {
			n = Integer.parseInt(br.readLine().replaceAll(" ", ""));
			if (n == -1) break;
			
			sum = 0;
			for (int i = 0, bet = 0; i < n; i++) {
				tmp = br.readLine();
				s = Integer.parseInt(tmp.split(" ")[0]);
				t = Integer.parseInt(tmp.split(" ")[1]);
				
				sum += (s * (t-bet));
				bet = t; 
			}
			sb.append(sum + " miles\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
