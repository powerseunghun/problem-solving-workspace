package Acmicpc.As.B5.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonEducationPath34813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String res = null;
		
		switch(str.charAt(0)) {
		case 'F':
			res = "Foundation";
			break;
		case 'C':
			res = "Claves";
			break;
		case 'V':
			res = "Veritas";
			break;
		case 'E':
			res = "Exploration";
			break;
		}
		
		System.out.println(res);
		br.close();
	}
}
