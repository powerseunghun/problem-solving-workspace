package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandPrompt1032 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] commands = new String[N];
		String base = null, pattern = "";
		boolean flag = true;
		
		for (int i = 0; i < N; i++) {
			commands[i] = br.readLine();
		}
		base = commands[0];
		
		for (int i = 0; i < base.length(); i++) {
			flag = true;
			for (int j = 1; j < N; j++) {
				if (base.charAt(i) != commands[j].charAt(i)) {
					flag = false;
				}
			}
			pattern += flag ? base.charAt(i) : "?";
		}
		
		System.out.println(pattern);
		
	}
}
