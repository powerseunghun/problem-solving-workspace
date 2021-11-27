package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoEgg {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), height = 1;
		while (height * (height + 1) / 2 < N) {
			height++;
		}
		
		System.out.println(height);
		br.close();
	}
}
