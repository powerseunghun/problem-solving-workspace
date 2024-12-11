package Acmicpc.As.B4.ThirtyThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralizedFizzBuzz32801 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1]);
		int b = Integer.parseInt(str.split(" ")[2]), x = 0, y = 0, z = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i%a == 0 && i%b == 0) z++;
			else if (i%a == 0) x++;
			else if (i%b == 0) y++;
		}
		
		System.out.println(x + " " + y + " " + z);
		br.close();
	}
}
