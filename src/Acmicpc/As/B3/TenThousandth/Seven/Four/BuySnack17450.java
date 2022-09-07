package Acmicpc.As.B3.TenThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuySnack17450 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		double a = 0, b = 0, max = Double.MIN_VALUE, tVal = 0;
		char res = ' ';
		
		for (int i = 0; i < 3; i++) {
			tmp = br.readLine();
			a = Double.parseDouble(tmp.split(" ")[0]);
			b = Double.parseDouble(tmp.split(" ")[1]);
			tVal = (b*10) / ((a*10) - (a*10 >= 5000 ? 500 : 0));
			if (tVal > max) {
				max = tVal;
				res = i == 0 ? 'S' : i == 1 ? 'N' : 'U';
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
