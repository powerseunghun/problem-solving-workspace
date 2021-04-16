package Acmicpc.Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakEvenPoint1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		long s = 0;
		
		while ((A + (B * s) >= C * s)) {
			if (B >= C) {
				s-=1;
				break;
			}
			else s += 1;
		}
		System.out.println(s);
	}
}
