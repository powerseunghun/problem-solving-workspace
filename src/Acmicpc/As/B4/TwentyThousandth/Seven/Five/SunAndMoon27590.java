package Acmicpc.As.B4.TwentyThousandth.Seven.Five;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SunAndMoon27590 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int ds = Integer.parseInt(str.split(" ")[0]);
		int ys = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int dm = Integer.parseInt(str.split(" ")[0]);
		int ym = Integer.parseInt(str.split(" ")[1]);
		int s = ys-ds, m = ym-dm;
		
		while (m != s) {
			if (s < m) s += ys;
			else m += ym;
		}
		
		System.out.println(s);
		br.close();
	}
}
