package Acmicpc.As.B2.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSquaredDigitsFunction15296 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int P = Integer.parseInt(br.readLine());
		long K = 0, b = 0, n = 0, res = 0;
		String str = null;
		
		while(P-- > 0) {
			str = br.readLine();
			K = Long.parseLong(str.split(" ")[0]);
			b = Long.parseLong(str.split(" ")[1]);
			n = Long.parseLong(str.split(" ")[2]);
			
			res = 0;
			while(n != 0) {
				res += Math.pow(n%b, 2);
				n /= b;
			}
			sb.append(K).append(" ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
