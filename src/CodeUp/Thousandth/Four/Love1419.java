package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Love1419 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int count = 0;
		
		for (int i = 0; i <= tmp.length() - 4; i++) {
			if (tmp.charAt(i) == 'l' && tmp.charAt(i+1) == 'o' &&
				tmp.charAt(i+2) == 'v' && tmp.charAt(i+3) == 'e') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
