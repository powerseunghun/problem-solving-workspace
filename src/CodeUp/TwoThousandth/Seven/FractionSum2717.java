package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionSum2717 {
	static int GCD(int a, int b) {
		if (b%a == 0) return a;
		else return GCD(b%a, a);
	}
	static int LCM(int a, int b) {
		return (a * b) / GCD(a, b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), lcm = 1, sum = 0;
		String[] fractions = new String[100];
		String tmp = null;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			fractions[i] = tmp;
			lcm = LCM(lcm, Integer.parseInt(tmp.split(" ")[1]));
		}
		
		for (int i = 0; i < N; i++) {
			tmp = fractions[i];
			sum += (lcm / Integer.parseInt(tmp.split(" ")[1])) * Integer.parseInt(tmp.split(" ")[0]);
		}
		
		System.out.println((sum/GCD(sum,lcm))  + "/" + (lcm/GCD(sum,lcm)));
	}
}
