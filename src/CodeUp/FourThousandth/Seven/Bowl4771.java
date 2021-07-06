package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bowl4771 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 10;
		char last = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			sum += last == str.charAt(i) ? 5 : 10;
			last = str.charAt(i);
		}
		
		System.out.println(sum);
	}
}
