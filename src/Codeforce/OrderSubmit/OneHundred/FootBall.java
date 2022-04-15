package Codeforce.OrderSubmit.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootBall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 1;
		
		for (int i = 1; i < str.length(); i++) {
			count = str.charAt(i) != str.charAt(i-1) ? 1 : count+1; 
			if (count >= 7) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		br.close();
	}
}
