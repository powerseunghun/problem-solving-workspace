package SWExpertAcademy.D3.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class BigDecimalSum3260 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		BigDecimal a = null, b = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			a = new BigDecimal(tmp.split(" ")[0]);
			b = new BigDecimal(tmp.split(" ")[1]);
			sb.append("#" + i + " " + a.add(b) + "\n");
		}
		System.out.print(sb.toString());
	}
}
