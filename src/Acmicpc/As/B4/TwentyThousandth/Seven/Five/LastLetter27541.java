package Acmicpc.As.B4.TwentyThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastLetter27541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		System.out.println(str.charAt(str.length()-1) == 'G' ? str.substring(0, str.length()-1) : str + 'G');
		br.close();
	}
}
