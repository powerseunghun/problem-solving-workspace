package Acmicpc.As.B1.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckDigits9228 {
	static final int div = 11;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, rStr = null;
		long n = 0, w = 0, sum = 0, rem = 0;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			
			sum = 0;
			w = 2;
			n = Long.parseLong(str);
			while (n != 0) {
				sum += (n % 10) * w++;
				n /= 10;
			}
			sum %= div;
			rem = div - sum; 
			
			if (rem == (div-1)) {
				sb.append(str).append(" -> Rejected");
			}
			else {
				rStr = rem == div ? "0" : rem+"";
				sb.append(str).append(" -> ").append(rStr);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
