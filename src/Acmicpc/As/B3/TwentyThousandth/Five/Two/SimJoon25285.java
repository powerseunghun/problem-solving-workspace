package Acmicpc.As.B3.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimJoon25285 {
	static double func(int h, int w) {
		double dw = h / 100.0;
		return w / Math.pow(dw, 2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), h = 0, w = 0, r = 0;
		double b = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			h = Integer.parseInt(tmp.split(" ")[0]);
			w = Integer.parseInt(tmp.split(" ")[1]);
			b = func(h, w);
			if (h <= 140) r = 6;
			else if (h < 146) r = 5;
			else if (h < 159 || h >= 204) r = 4;
			else if (h < 161) {
				if (b < 16.0 || b >= 35.0) r = 4;
				else r = 3;
			}
			else if (h < 204) {
				if (b < 16.0 || b >= 35.0) r = 4;
				else if ((b >= 16.0 && b < 18.5) || (b >= 30.0 && b < 35.0)) r = 3; 
				else if ((b >= 18.5 && b < 20.0) || (b >= 25.0 && b < 30.0)) r = 2;
				else if (b >= 20.0 && b < 25.0) r = 1;
			}
			sb.append(r + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
