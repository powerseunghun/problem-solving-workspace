package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindCLanguage1414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int c = 0, cc = 0;
		
		for (int i = 0; i < tmp.length()-1; i++) {
			if (tmp.charAt(i) == 'c' || tmp.charAt(i) == 'C') {
				c++;
				if (tmp.charAt(i+1) == 'c' || tmp.charAt(i+1) == 'C') cc++;
			}
		}
		c = tmp.charAt(tmp.length()-1) == 'c' || tmp.charAt(tmp.length()-1) == 'C' ? c + 1 : c;
		
		System.out.println(c);
		System.out.println(cc);
	}
}
