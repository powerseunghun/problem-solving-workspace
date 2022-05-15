package Acmicpc.As.B4.TenThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Petrol18330 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine()) + 60;
		
		if (n <= k) System.out.println(n*1500);
		else  System.out.println(k*1500 + (n-k) * 3000);
		br.close();
	}
}
