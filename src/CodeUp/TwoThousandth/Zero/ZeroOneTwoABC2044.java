package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOneTwoABC2044 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case '0': case '1':	case '2':
				str += s.charAt(i);
				break;
			case 'A':
				str = str.substring(0, str.length() - 1);
				break;
			case 'B':
				str = str.substring(0, str.length() - 2);
				break;
			case 'C':
				str = "";
				break;
			}
		}
		System.out.println(str);
	}
}
