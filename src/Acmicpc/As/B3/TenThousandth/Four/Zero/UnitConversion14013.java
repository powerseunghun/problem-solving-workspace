package Acmicpc.As.B3.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnitConversion14013 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder(); 
		double x = Double.parseDouble(tmp.split(" ")[0]);
		double y = Double.parseDouble(tmp.split(" ")[1]);
		double t = 0;
		int z = Integer.parseInt(br.readLine());
		char cmd = ' ';
		
		while(z-- > 0) {
			tmp = br.readLine();
			t = Double.parseDouble(tmp.split(" ")[0]);
			cmd = tmp.split(" ")[1].charAt(0);
			switch(cmd) {
			case 'A':
				sb.append((t*y/x) + "\n");
				break;
			case 'B':
				sb.append((t*x/y) + "\n");
				break;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
