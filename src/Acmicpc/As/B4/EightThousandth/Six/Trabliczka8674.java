package Acmicpc.As.B4.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trabliczka8674 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long .parseLong(tmp.split(" ")[0]);
		long B = Long .parseLong(tmp.split(" ")[1]);
		
		if (A % 2 == 0 || B % 2 == 0) {
			System.out.println("0");
			return;
		}
		
		System.out.println(Math.min(A, B));
		br.close();
	}
}
