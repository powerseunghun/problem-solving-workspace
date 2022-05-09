package Acmicpc.As.B4.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FillTile15700 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long N = Long.parseLong(tmp.split(" ")[0]);
		long M = Long.parseLong(tmp.split(" ")[1]);
		
		System.out.println(N*M/2);
		br.close();
	}
}
