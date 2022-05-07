package Acmicpc.As.B4.TwoThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JudgingMoose15025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int l = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		
		if (l == 0 && r == 0) {
			System.out.println("Not a moose");
			return;
		}
		
		if (l == r) {
			System.out.print("Even ");
		}
		else System.out.print("Odd ");
		
		System.out.println(Math.max(l, r) * 2);
		br.close();
	}
}
