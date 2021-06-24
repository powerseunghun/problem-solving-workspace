package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OvertimePay4051 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		double s = 0, e = 0, sum = 0, money = 0;
		
		for (int i = 0; i < 5; i++) {
			tmp = br.readLine();
			s = Double.parseDouble(tmp.split(" ")[0]);
			e = Double.parseDouble(tmp.split(" ")[1]);
			
			if (e-s > 1) {
				sum = e-s-1 > 4 ? sum + 4 : sum + (e-s-1);
			}
		}
		money = sum * 10000;
		if (sum >= 15) {
			money -= (money * 0.05);
		}
		else if (sum <= 5) {
			money += (money * 0.05);
		}
		
		System.out.printf("%.0f", money);
	}
}
