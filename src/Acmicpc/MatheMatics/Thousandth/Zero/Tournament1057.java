package Acmicpc.MatheMatics.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tournament1057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int num1 = Integer.parseInt(tmp.split(" ")[1]);
		int num2 = Integer.parseInt(tmp.split(" ")[2]), count = 0;
		
		if (N < num1 || N < num2) {
			System.out.println("-1");
			return;
		}
		while (num1 != num2) {
			num1 = (++num1)/2;
			num2 = (++num2)/2;
			count++;
		}
		System.out.println(count);
	}
}
