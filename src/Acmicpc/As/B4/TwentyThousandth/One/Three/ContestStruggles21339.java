package Acmicpc.As.B4.TwentyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContestStruggles21339 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double n = Double.parseDouble(tmp.split(" ")[0]);
		double k = Double.parseDouble(tmp.split(" ")[1]);
		tmp = br.readLine();
		double d = Double.parseDouble(tmp.split(" ")[0]);
		double s = Double.parseDouble(tmp.split(" ")[1]);
		double t = (d*n - k*s) / (n-k);
		
		System.out.println(t > 100 ? "impossible" : t);
		br.close();
	}
}
