package Acmicpc.As.B3.ThirtyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastOneStanding30569 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h1 = Integer.parseInt(str.split(" ")[0]);
		int d1 = Integer.parseInt(str.split(" ")[1]);
		int t1 = Integer.parseInt(str.split(" ")[2]);
		str = br.readLine();
		int h2 = Integer.parseInt(str.split(" ")[0]);
		int d2 = Integer.parseInt(str.split(" ")[1]);
		int t2 = Integer.parseInt(str.split(" ")[2]);
		
		for (double a=0,b=0,i=0; h1>0 && h2>0; i+=0.5) {
			if (i >= a) {
				a = t1+i;
				h2 -= d1;
			}
			if (i >= b) {
				b = t2+i;
				h1 -= d2;
			}
		}
		
		System.out.println((h1>0 ? "player one" : h2>0 ? "player two" : "draw"));
		br.close();
	}
}
