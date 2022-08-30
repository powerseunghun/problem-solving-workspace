package Acmicpc.As.B3.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhyWrong15820 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int S1 = Integer.parseInt(tmp.split(" ")[0]);
		int S2 = Integer.parseInt(tmp.split(" ")[1]);
		int a = 0, b = 0;
		
		for (int i = 0; i < S1+S2; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a != b) {
				System.out.println(i < S1 ? "Wrong Answer" : "Why Wrong!!!");
				br.close();
				return;
			}
		}
		
		System.out.println("Accepted");
		br.close();
	}
}
