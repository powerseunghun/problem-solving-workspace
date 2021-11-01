package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberReverse {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		
		System.out.println(Integer.parseInt(sb.reverse().toString()));
	}
}
