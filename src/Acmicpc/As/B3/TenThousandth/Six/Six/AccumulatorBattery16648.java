package Acmicpc.As.B3.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccumulatorBattery16648 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int t = Integer.parseInt(tmp.split(" ")[0]);
		int p = Integer.parseInt(tmp.split(" ")[1]);
		int b = p >= 20 ? 100-p : 80 + ((20-p) * 2);
		float m = t / (float)b;
		
		System.out.println(p >= 20 ? ((p-20)*m) + (m*40) : p*2*m);
		br.close();
	}
}
