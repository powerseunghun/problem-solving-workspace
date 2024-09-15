package Acmicpc.As.B3.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Стандартывремени29657 {
	static final int l = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int a1 = 0, a2 = 0, b1 = 0, b2 = 0, c1 = 0, c2 = 0;
		int h1 = 0, m1 = 0, s1 = 0;
		
		for (int i = 0; i < l; i++) {
			str = br.readLine();
			switch(i) {
			case 0:
				a1 = Integer.parseInt(str.split(" ")[0]);
				b1 = Integer.parseInt(str.split(" ")[1]);
				c1 = Integer.parseInt(str.split(" ")[2]);
				break;
			case 1:
				a2 = Integer.parseInt(str.split(" ")[0]);
				b2 = Integer.parseInt(str.split(" ")[1]);
				c2 = Integer.parseInt(str.split(" ")[2]);
				break;
			case 2:
				h1 = Integer.parseInt(str.split(" ")[0]);
				m1 = Integer.parseInt(str.split(" ")[1]);
				s1 = Integer.parseInt(str.split(" ")[2]);
				break;
			}
		}
		int temp = b1*c1*h1+c1*m1+s1;
		
		System.out.println((temp/c2/b2) + " " + (temp/c2%b2) + " " + (temp%c2));
		br.close();
	}
}
