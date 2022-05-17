package Acmicpc.As.B4.TwoThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rulltrappa20867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		double M = 0, S = 0, G = 0, A = 0, B = 0, L = 0, R = 0;
		double res1 = 0, res2 = 0;
		
		for (int i = 0; i < 3; i++) {
			tmp = br.readLine();
			switch(i) {
			case 0:
				M = Double.parseDouble(tmp.split(" ")[0]);
				S = Double.parseDouble(tmp.split(" ")[1]);
				G = Double.parseDouble(tmp.split(" ")[2]);
				break;
			case 1:
				A = Double.parseDouble(tmp.split(" ")[0]);
				B = Double.parseDouble(tmp.split(" ")[1]);
				break;
			case 2:
				L = Double.parseDouble(tmp.split(" ")[0]);
				R = Double.parseDouble(tmp.split(" ")[1]);
				break;
			}
		}
		res1 = (M % G == 0 ? M / G + 1 : M / G) + L / A;
		res2 = (M % S == 0 ? M / S + 1 : M / S) + R / B;
		
		if (res1 > res2) System.out.println("latmask");
		else System.out.println("friskus");
		br.close();
	}
}
