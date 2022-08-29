package Acmicpc.As.B3.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamJungHun15734 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int L = Integer.parseInt(tmp.split(" ")[0]);
		int R = Integer.parseInt(tmp.split(" ")[1]);
		int A = Integer.parseInt(tmp.split(" ")[2]);
		int total = L+R+A;
		
		// 4 5 2   total = 11  5 5 1 6 5 == 1 (5) 7 4 == 3 (4)
		int g = A - Math.abs(L-R);
		
		System.out.println(total - (g < 0 ? Math.abs(g) : g%2));
		br.close();
	}
}
