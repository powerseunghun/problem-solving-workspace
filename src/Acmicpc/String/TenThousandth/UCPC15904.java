package Acmicpc.String.TenThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCPC15904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int findIdx = 0;
		
		for (int i = 0; i < s.length(); i++) {
			switch(findIdx) {
			case 0:
				if (s.charAt(i) == 'U') findIdx++;
				break;
			case 1:
				if (s.charAt(i) == 'C') findIdx++;
				break;
			case 2:
				if (s.charAt(i) == 'P') findIdx++;
				break;
			case 3:
				if (s.charAt(i) == 'C') findIdx++;
				break;
			}
		}
		if (findIdx >= 4) System.out.println("I love UCPC");
		else System.out.println("I hate UCPC");
	}
}
