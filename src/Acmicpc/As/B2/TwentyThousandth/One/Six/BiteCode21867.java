package Acmicpc.As.B2.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiteCode21867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine().replaceAll("J|A|V", "");
		
		System.out.println(0 == str.length() ? "nojava" : str);
		br.close();
	}
}
