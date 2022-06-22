package Acmicpc.As.B3.EightThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ratownik8574 {
	static boolean check(double cx, double cy, double k, double x, double y) {
		if (Math.sqrt(Math.pow(cx-x, 2) + Math.pow(cy-y, 2)) > k) return false;
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double n = Double.parseDouble(tmp.split(" ")[0]);
		double k = Double.parseDouble(tmp.split(" ")[1]);
		double x = Double.parseDouble(tmp.split(" ")[2]);
		double y = Double.parseDouble(tmp.split(" ")[3]);
		double cx = 0, cy = 0;
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			cx = Double.parseDouble(tmp.split(" ")[0]);
			cy = Double.parseDouble(tmp.split(" ")[1]);
			
			if (!check(cx, cy, k, x, y)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
