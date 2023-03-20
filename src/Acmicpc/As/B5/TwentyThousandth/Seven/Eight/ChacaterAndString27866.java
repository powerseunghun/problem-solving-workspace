package Acmicpc.As.B5.TwentyThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChacaterAndString27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(str.charAt(Integer.parseInt(br.readLine())-1));
		br.close();
	}
}
