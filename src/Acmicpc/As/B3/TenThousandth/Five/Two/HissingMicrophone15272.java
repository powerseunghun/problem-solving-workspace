package Acmicpc.As.B3.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HissingMicrophone15272 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(br.readLine().contains("ss") ? "hiss" : "no hiss");
		br.close();
	}
}
