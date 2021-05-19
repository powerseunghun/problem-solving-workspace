package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalPointDownPrint2606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]), idx = 0;
		String s = ((double)n/d) + "";
		BigDecimal bd = new BigDecimal(s).setScale(10, RoundingMode.DOWN);
		
		for (int i = 0; i < bd.toString().length(); i++) {
			if (bd.toString().charAt(i) == '.') {
				idx = i+1;
				break;
			}
		}
		
		System.out.println(bd.toString().substring(idx, bd.toString().length()));
	}
}
