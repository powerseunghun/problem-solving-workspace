package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayLeague {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 1; i <= input-1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
