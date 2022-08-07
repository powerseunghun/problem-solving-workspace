package Acmicpc.As.B3.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumbledCompass13363 {
	static int func(int n1, int n2) {
		int res1 = 0, res2 = 0;
		
		while ((n1+res1) % 360 != n2) {
			res1++;
		}
		while ((n1-res2 < 0 ? n1-res2+360 : n1-res2) != n2) {
			res2++;
		}
		return res1 < res2 ? res1 : res1==res2 ? res2 : res2*-1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		
		System.out.println(func(n1, n2));
		br.close();
	}
}
