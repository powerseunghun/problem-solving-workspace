package Acmicpc.As.B1.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterRecognize3448 {
	static boolean check(double b, double r) {
		double res = (r / b) * 100.0;
		return res == (int)res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double b = 0, r = 0, res = 0;
		String str = null;
		
		while(T-- > 0) {
			b = 0;
			r = 0;
			while (true) {
				str = br.readLine();
				if (str.equals("")) break;
				b += str.length();
				r += str.replaceAll("#", "").length();
			}
			res = r / b * 100.0;
			
			sb.append("Efficiency ratio is ");
			sb.append(check(b, r) ? (int)res : String.format("%.1f", res));
			sb.append("%.").append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
