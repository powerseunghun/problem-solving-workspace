package Acmicpc.As.B4.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Skarpetki26742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cb = str.replaceAll("C", "").length();
		int cc = str.replaceAll("B", "").length();
		
		System.out.println(cb/2+cc/2);
		br.close();
	}
}
