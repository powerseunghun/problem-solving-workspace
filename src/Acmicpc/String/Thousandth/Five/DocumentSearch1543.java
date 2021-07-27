package Acmicpc.String.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocumentSearch1543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		String pattern = br.readLine();
		int idx = 0, count = 0;
		
		while ((idx = sb.toString().indexOf(pattern)) != -1) {
			sb.delete(0, idx+pattern.length());
			count++;
		}
		
		System.out.println(count);
	}
}
