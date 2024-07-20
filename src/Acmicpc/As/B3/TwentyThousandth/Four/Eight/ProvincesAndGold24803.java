package Acmicpc.As.B3.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProvincesAndGold24803 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), p1 = null, p2 = null;
		int g = Integer.parseInt(str.split(" ")[0]);
		int s = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int v = g*3+s*2+c;
		
		p1 = v >= 8 ? "Province" : v >= 5 ? "Duchy" : v >= 2 ? "Estate" : "";
		p2 = v >= 6 ? "Gold" : v >= 3 ? "Silver" : "Copper";
		
		System.out.println(p1 + (p1.isEmpty() ? "" : " or ") + p2);
		br.close();
	}
}
