package Acmicpc.As.B3.ThirtyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SciComLove31746 {
	static final String target = "SciComLove";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(target);
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N%2 != 0 ? sb.reverse().toString() : sb.toString());
		br.close();
	}
}
