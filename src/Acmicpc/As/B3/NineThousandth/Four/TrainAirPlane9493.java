package Acmicpc.As.B3.NineThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainAirPlane9493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double M = 0, A = 0, B = 0, t = 0;
		int h = 0, m = 0, s = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			M = Double.parseDouble(tmp.split(" ")[0]);
			A = Double.parseDouble(tmp.split(" ")[1]);
			B = Double.parseDouble(tmp.split(" ")[2]);
			if (M == 0 && A == 0 && B == 0) break;
			
			t = Math.round((M/A-M/B) * 3600);
			h = (int)(t/3600);
			m = (int)(t%3600/60);
			s = (int)(t%60);
			sb.append(String.format("%d:%02d:%02d\n", h, m, s));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
