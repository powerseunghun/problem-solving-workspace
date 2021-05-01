package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1079 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == 'q') {
				System.out.println(tmp.charAt(i));
				break;
			}
			else if (tmp.charAt(i) == ' ') continue;
			System.out.println(tmp.charAt(i));
		}
	}
}
