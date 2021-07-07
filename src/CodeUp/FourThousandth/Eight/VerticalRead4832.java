package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerticalRead4832 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = new String[5];
		int maxLength = 0;
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
			maxLength = strs[i].length() >= maxLength ? strs[i].length() : maxLength;
		}
		
		for (int i = 0; i < maxLength; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (i >= strs[j].length()) continue;
				else System.out.print(strs[j].charAt(i));
			}
		}
	}
}
