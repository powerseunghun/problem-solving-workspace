package Acmicpc.As.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZadaniePróbne8545 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		
		System.out.println(sb.reverse().toString());
		br.close();
	}
}
