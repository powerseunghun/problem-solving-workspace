package Acmicpc.As.B4.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoComplete24883 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		System.out.println((tmp.charAt(0) == 'N' || tmp.charAt(0) == 'n') ? "Naver D2" : "Naver Whale") ;
		br.close();
	}
}
