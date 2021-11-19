package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadSaySequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine().replaceAll(" ", "");
		int count = 0, number = 0;
		
		for (int i = 0; i < str.length()-1; i++) {
			number = str.charAt(i)-'0';
			count = 1;
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) count++;
				else {
					i = j-1;
					break;
				}
			}
			sb.append(count + " " + number + " ");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
