package Acmicpc.As.B3.ThirtyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cornhusker30527 {
	static int[] a = null, l = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		a = new int[str.split(" ").length/2];
		l = new int[str.split(" ").length/2];
		
		for (int i = 0, idx1 = 0, idx2 = 0; i < str.split(" ").length; i++) {
			if (i % 2 == 0) {
				a[idx1++] = Integer.parseInt(str.split(" ")[i]);
			} else {
				l[idx2++] = Integer.parseInt(str.split(" ")[i]);
			}
		}
		str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int kwf = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		for (int i = 0; i < Math.min(a.length, l.length); i++) {
			res += a[i] * l[i];
		}
		
		System.out.println(res/5*n/kwf);
		br.close();
	}
}
