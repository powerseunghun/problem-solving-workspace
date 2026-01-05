package Acmicpc.As.B3.ThirtyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ramyun34687 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);	
		int M = Integer.parseInt(str.split(" ")[1]);

		System.out.println(N*81 <= M*100 ? "yaho" : "no");
		br.close();
	}
}
