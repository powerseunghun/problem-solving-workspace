package Acmicpc.As.B3.ThirtyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItsyBits35247 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		int b = 1, res = 1;
		
		while(n >> 1 != 0) {
			b++;
		}
		
		while(res < b) {
			res <<= 1;
		}
		
		System.out.println(res + " bit" + (res == 1 ? "" : "s"));
		br.close();
	}
}
