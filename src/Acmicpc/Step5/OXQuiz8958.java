package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz8958 {
	static int getScore(String str) {
		int sum = 0, weight = 0;
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'O':
				sum += (1 + weight);
				weight += 1;
				break;
			case 'X':
				weight = 0;
				break;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			sb.append(getScore(br.readLine()) + "\n");
		}
		
		System.out.println(sb);
	}
}
