package Goorm.AlgorithmHeroes.T8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= str.length(); i++) {
			sb.append(str.subSequence(0, i) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
