package Codeforce.OrderSubmit.EightHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonAndDanik {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int cnt1 = 0, cnt2 = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') cnt1++;
			else if (str.charAt(i) == 'D') cnt2++;
		}
		
		if (cnt1 > cnt2) System.out.println("Anton");
		else if(cnt2 > cnt1) System.out.println("Danik");
		else System.out.println("Friendship");
		
		br.close();
	}
}
