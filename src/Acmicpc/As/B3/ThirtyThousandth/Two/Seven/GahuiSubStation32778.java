package Acmicpc.As.B3.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GahuiSubStation32778 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if (!str.contains("(")) {
			System.out.println(str);
			System.out.println("-");
		} else {
			System.out.println(str.substring(0, str.indexOf("(")-1));
			System.out.println(str.substring(str.indexOf("(")+1, str.lastIndexOf(")")));
		}
		
		br.close();
	}
}
