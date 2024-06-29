package Acmicpc.As.B3.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmeDespertador13670 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int h1 = 0, m1 = 0, h2 = 0, m2 = 0;
		
		while(true) {
			str = br.readLine();
			h1 = Integer.parseInt(str.split(" ")[0]);
			m1 = Integer.parseInt(str.split(" ")[1]);
			h2 = Integer.parseInt(str.split(" ")[2]);
			m2 = Integer.parseInt(str.split(" ")[3]);
			
			if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) break;
			
			sb.append(Math.abs((h2-h1) * 60 + ((m2-m1+1440)%1440))).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
