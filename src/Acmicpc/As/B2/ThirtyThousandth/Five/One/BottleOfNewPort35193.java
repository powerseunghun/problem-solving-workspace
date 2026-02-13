package Acmicpc.As.B2.ThirtyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BottleOfNewPort35193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long a = Long.parseLong(str.split(" ")[0]);
		long o = Long.parseLong(str.split(" ")[1]);
		str = br.readLine();
		long deltaA = Long.parseLong(str.split(" ")[0]);
		long deltaO = Long.parseLong(str.split(" ")[1]);
		
		a = Math.max(0, a-deltaA*d);
		o = Math.max(0, o-deltaO*d);
		
		System.out.println(String.format("%.7f", (double)a/(a+o)*100));
		br.close();
	}
}
