package Acmicpc.As.B4.TenThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MáquinaDeCafé15051 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A1 = Integer.parseInt(br.readLine());
		int A2 = Integer.parseInt(br.readLine());
		int A3 = Integer.parseInt(br.readLine());
		int tmp = Math.min(A1*2 + A3*2, A1*4 + A2*2);
		
		System.out.println(Math.min(A3*4 + A2*2, tmp));
		br.close();
	}
}
