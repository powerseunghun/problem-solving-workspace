package CodeUp.Basic100;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IO1017 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n + " " + n + " " + n);
	}
}
