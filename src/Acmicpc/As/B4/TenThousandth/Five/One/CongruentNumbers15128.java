package Acmicpc.As.B4.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CongruentNumbers15128 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double p1 = Double.parseDouble(tmp.split(" ")[0]);
		double q1 = Double.parseDouble(tmp.split(" ")[1]);
		double p2 = Double.parseDouble(tmp.split(" ")[2]);
		double q2 = Double.parseDouble(tmp.split(" ")[3]);
		double res = p1/q1 * p2/q2 / 2;
		
		System.out.println((int)(res+0.5) == res ? "1" : "0");
		br.close();
	}
}
