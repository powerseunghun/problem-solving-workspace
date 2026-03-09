package Acmicpc.As.B3.ThirtyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Koehandel35202 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int c = Integer.parseInt(str.split(" ")[0]);
		int n = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(c < n ? c+1 : c == n ? c : 0);
		br.close();
	}
}
