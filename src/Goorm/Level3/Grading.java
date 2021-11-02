package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grading {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = 0, weight = 1;
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == 'o') {
				sum += weight++; 
			}
			else weight = 1;
		}
		System.out.println(sum);
	}
}
