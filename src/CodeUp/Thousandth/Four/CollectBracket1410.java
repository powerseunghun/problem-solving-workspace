package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectBracket1410 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int lP = 0, rP = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			char c = tmp.charAt(i);
			lP = c == '(' ? lP + 1 : lP;
			rP = c == ')' ? rP + 1 : rP;
		}
		
		System.out.println(lP + " " + rP);
	}
}
