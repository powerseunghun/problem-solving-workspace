package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberBaseBall4078 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String str = tmp.split(" ")[0], answer = null;
		int n = Integer.parseInt(tmp.split(" ")[1]), s = 0, b = 0;
		
		for (int i = 0; i < n; i++) {
			answer = br.readLine();
			s = 0;
			b = 0;
			if (str.equals(answer)) {
				System.out.println("3S");
				System.out.println("SUCCESS");
				return;
			}
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == answer.charAt(j)) s++;
			}
			if (s > 0) System.out.print(s + "S");
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < str.length(); k++) {
					if (j == k) continue;
					
					if (answer.charAt(j) == str.charAt(k)) b++;
				}
			}
			if (b > 0) System.out.print(b + "B");
			
			if (s == 0 && b == 0) System.out.print("OUT");
			System.out.println();
		}
		System.out.println("FAIL");
	}
}
