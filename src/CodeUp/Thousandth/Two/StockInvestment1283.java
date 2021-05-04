package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StockInvestment1283 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		double tmp = a;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			tmp += (tmp * Integer.parseInt(st.nextToken()) / 100);
		}
		
		System.out.printf("%.0f\n", tmp - a);
		if (tmp - a > 0) System.out.println("good");
		else if (tmp - a == 0) System.out.println("same");
		else System.out.println("bad");
	}
}
