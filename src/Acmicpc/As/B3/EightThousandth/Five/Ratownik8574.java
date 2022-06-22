package Acmicpc.As.B3.EightThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ratownik8574 {
	static boolean check(int cx, int cy, int k, int x, int y) {
		if (((x-k) <= cx && cx <= (x+k)) && ((y-k) <= cy && cy <= (y+k))) return true;
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int x = Integer.parseInt(tmp.split(" ")[2]);
		int y = Integer.parseInt(tmp.split(" ")[3]), res = 0;
		
		for (int i = 0, cx = 0, cy = 0; i < n; i++) {
			tmp = br.readLine();
			cx = Integer.parseInt(tmp.split(" ")[0]);
			cy = Integer.parseInt(tmp.split(" ")[1]);
			
			if (check(cx, cy, k, x, y)) res++;
		}
		
		System.out.println(n-res);
		br.close();
	}
}
