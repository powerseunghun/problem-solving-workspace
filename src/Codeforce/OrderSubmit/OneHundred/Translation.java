package Codeforce.OrderSubmit.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Translation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		
		System.out.println(br.readLine().equals(sb.reverse().toString()) ? "YES" : "NO");
		br.close();
	}
}
