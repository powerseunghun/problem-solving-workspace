package Acmicpc.As.B3.TwentyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContestStruggles21339 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double n = Double.parseDouble(str.split(" ")[0]);
		double k = Double.parseDouble(str.split(" ")[1]);
		str = br.readLine();
		double d = Double.parseDouble(str.split(" ")[0]);
		double s = Double.parseDouble(str.split(" ")[1]);
		double res = (d*n - s*k) / (n-k);
		
		System.out.println((res < 0 || res > 100) ? "impossible" : String.format("%.7f", res));
		br.close();
	}
}
