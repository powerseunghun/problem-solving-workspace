package Acmicpc.As.B4.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ЧАСОВНИК24356 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int t1 = Integer.parseInt(tmp.split(" ")[0]);
		int m1 = Integer.parseInt(tmp.split(" ")[1]);
		int t2 = Integer.parseInt(tmp.split(" ")[2]);
		int m2 = Integer.parseInt(tmp.split(" ")[3]);
		
		m1 += t1 * 60;
		m2 += t2 * 60;
		m2 += (m1 > m2 ? 1440 : 0);
		
		System.out.println((m2-m1) + " " + (m2-m1)/30);
		br.close();
	}
}
