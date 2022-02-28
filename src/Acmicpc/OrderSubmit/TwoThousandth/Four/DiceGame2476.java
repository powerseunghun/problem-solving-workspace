package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame2476 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), tmpMoney = 0, max = 0;
		for (int i = 0, a = 0, b = 0, c = 0; i < N; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			if (a == b && b == c) {
				tmpMoney = 10000 + a * 1000;
			}
			else if (a != b && b != c && a != c) {
				tmpMoney = Math.max(a, Math.max(b, c)) * 100;
			}
			else {
				if (a == b) {
					tmpMoney = a;
				}
				else if (a == c) {
					tmpMoney = a;
				}
				else { // b==c
					tmpMoney = b;
				}
				tmpMoney *= 100;
				tmpMoney += 1000;
			}
			max = Math.max(tmpMoney, max);
		}
		
		System.out.println(max);
		br.close();
	}
}
