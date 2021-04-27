package CodeUp.Basic100;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IO1012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%.6f", Float.parseFloat(br.readLine()));
	}
}
