package Acmicpc.As.B3.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxVolume9776 {
	static final double pi = 3.14159;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		double h = 0, r = 0, tVol = 0, max = -1; 
		
		while(N-- > 0) {
			tmp = br.readLine();
			switch(tmp.charAt(0)) {
			case 'S':
				r = Double.parseDouble(tmp.split(" ")[1]);
				tVol = 4.0 / 3.0 * pi * Math.pow(r, 3);
				break;
			case 'C':
				r = Double.parseDouble(tmp.split(" ")[1]);
				h = Double.parseDouble(tmp.split(" ")[2]);
				tVol = 1.0 / 3.0 * pi * Math.pow(r, 2) * h;
				break;
			case 'L':
				r = Double.parseDouble(tmp.split(" ")[1]);
				h = Double.parseDouble(tmp.split(" ")[2]);
				tVol = pi * Math.pow(r, 2) * h;
				break;
			}
			max = Math.max(tVol, max);
		}
		
		System.out.println(String.format("%.3f", max));
		br.close();
	}
}
