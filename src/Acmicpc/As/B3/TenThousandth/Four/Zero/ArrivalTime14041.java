package Acmicpc.As.B3.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrivalTime14041 {
	static int getTime(String str) {
		int h = Integer.parseInt(str.split(":")[0]) * 100;
		int m = Integer.parseInt(str.split(":")[1]);
		
		return h+m;
	}
	static String getStr(int h, int m) {
		return String.format("%02d", h)+":"+String.format("%02d", m);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double time = getTime(tmp), apd = 0;
		int h = Integer.parseInt(tmp.split(":")[0]);
		int m = Integer.parseInt(tmp.split(":")[1]);
		
		while (apd < 120) {
			if ((time >= 700 && time < 1000) || (time >= 1500 && time < 1900)) {
				apd += 0.5;
			}
			else apd += 1;
			m++;
			if (m >= 60) {
				m = 0;
				h++;
			}
			h = h >= 24 ? 0 : h;
			time = getTime(getStr(h, m));
		}
		
		System.out.println(getStr(h, m));
		br.close();
	}
}
