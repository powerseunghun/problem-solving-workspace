package Acmicpc.As.B3.SixThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MileageBank6243 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		int res = 0;
		
		while(true) {
			str = br.readLine();
			if (str.equalsIgnoreCase("#")) break;
			
			while (!str.equals("0")) {
				int c = Integer.parseInt(str.split(" ")[2]);
				char d = str.split(" ")[3].charAt(0);
				
				if (d == 'Y') res += Math.max(500, c);
				else if (d == 'B') res += c+(c+1) / 2;
				else res += c*2;
				
				str = br.readLine();
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
