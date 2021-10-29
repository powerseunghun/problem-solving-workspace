package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetSpecificNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()), sum = 1, val = 1;
		
		while (sum < num) {
			val++;
			sum += val;
		}
		System.out.println(val);
	}
}
