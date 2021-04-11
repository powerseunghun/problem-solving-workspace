package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int answer = 0;
		
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'A': case 'B': case 'C':
				answer += 2;
				break;
			case 'D': case 'E': case 'F':
				answer += 3;
				break;
			case 'G': case 'H': case 'I':
				answer += 4;
				break;
			case 'J': case 'K': case 'L':
				answer += 5;
				break;
			case 'M': case 'N': case 'O':
				answer += 6;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				answer += 7;
				break;
			case 'T': case 'U': case 'V':
				answer += 8;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				answer += 9;
				break;
			}
		}
		System.out.println(answer + str.length());
	}
}
