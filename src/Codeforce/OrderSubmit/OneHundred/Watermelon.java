package Codeforce.OrderSubmit.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N == 2 ? "NO" : N%2==0 ? "YES" : "NO");
		br.close();
	}
}
