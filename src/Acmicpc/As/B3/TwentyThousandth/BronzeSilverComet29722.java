package Acmicpc.As.B3.TwentyThousandth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BronzeSilverComet29722 {
	static final int mon = 30;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int y = Integer.parseInt(str.split("-")[0]);
		int m = Integer.parseInt(str.split("-")[1]);
		int d = Integer.parseInt(str.split("-")[2]);
		int n = Integer.parseInt(br.readLine());
		
		d += n;
		m += (d-1) / mon;
		d = (d-1) % mon+1;
		y += (m-1) / 12;
		m = (m-1) % 12+1;
		
		System.out.println(y + "-" + String.format("%02d", m) + "-" + String.format("%02d", d));
		br.close();
	}
}
