package Acmicpc.As.B4.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivarSalaries33192 {
	static String commaFormat(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length()-1, idx = 0; i >= 0; i--, idx++) {
			if (idx != 0 && idx % 3 == 0) {
				sb.append(",");
			}
			sb.append(str.charAt(i));
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), x = 0, k = 0, h = 0, res = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			k = Integer.parseInt(str.split(" ")[1]);
			h = Integer.parseInt(str.split(" ")[2]);
			res = x*h*2;
			k -= h;
			
			if (k > 140) {
				res += x*140;
				res += (k-140)*x*3/2;
			} else {
				res += x*k;
			}
			sb.append(commaFormat(String.valueOf(res))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
