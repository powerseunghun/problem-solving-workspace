package Acmicpc.As.B4.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester34722 {
	static boolean func(int s, int c, int a, int r) {
		return (s >= 1000) || (c >= 1600) || (a >= 1500) || (r != -1 && r <= 30);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		int s = 0, c = 0, a = 0, r = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			s = Integer.parseInt(str.split(" ")[0]);
			c = Integer.parseInt(str.split(" ")[1]);
			a = Integer.parseInt(str.split(" ")[2]);
			r = Integer.parseInt(str.split(" ")[3]);
			res = func(s, c, a, r) ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
