package Acmicpc.As.B3.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gg34032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(str.replaceAll("X", "").length()*2 >= N ? "Yes" : "No");
		br.close();
	}
}
