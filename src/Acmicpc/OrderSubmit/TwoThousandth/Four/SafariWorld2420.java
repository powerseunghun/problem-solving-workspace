package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SafariWorld2420 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long N = Long.parseLong(tmp.split(" ")[0]);
		long M = Long.parseLong(tmp.split(" ")[1]);
		
		System.out.println(Math.abs(N-M));
		br.close();
	}
}
