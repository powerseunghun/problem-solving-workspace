package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PresidentialElection25829 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), t1 = 0, t2 = 0, te1 = 0, te2 = 0;
		int a = 0, b = 0, c = 0;
		boolean flag1 = false, flag2 = false;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			t1 += b;
			t2 += c;
			if (b > c) te1 += a;
			else if (c > b) te2 += a;
		}
		flag1 = (t1 > t2) && (te1 > te2);
		flag2 = (t2 > t1) && (te2 > te1);
		
		System.out.println(flag1 ? "1" : flag2 ? "2" : "0");
		br.close();
	}
}
