package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumber11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int sum = 0;
		br.readLine();
		
		tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			sum += Integer.parseInt(tmp.charAt(i) + "");
		}
		
		System.out.println(sum);
	}
}
