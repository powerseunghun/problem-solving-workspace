package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddEvenDiscrimination {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		System.out.println(input % 2 == 0 ? "even" : "odd");
	}
}
