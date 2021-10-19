package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreeFiveMultiple {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine()), sum = 0;
		for (int i = 1; i <= input; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
			else if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
