package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretLetter2002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()), s = 0;
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			s = (int)(tmp.charAt(i))-((i+1) * 3 + K);
			if (s < 65) s += 26;
			System.out.print((char)s);
		}
	}
}
