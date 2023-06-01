package Acmicpc.As.B3.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RepeatingString27329 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		System.out.println(str.substring(0, str.length()/2).equals(str.substring(str.length()/2, str.length())) ? "Yes" : "No");
		br.close();
	}
}