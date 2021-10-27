package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DTEST {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int base = 3, weight = 5, value = 1;
		
		while (N > base) {
			base += weight;
			weight += 2;
			value++;
		}
		
		System.out.println(value);
	}
}
