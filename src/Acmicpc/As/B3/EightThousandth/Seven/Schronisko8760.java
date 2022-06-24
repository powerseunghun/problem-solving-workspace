package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.IOException;
import java.util.Scanner;

public class Schronisko8760 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt(), w = 0, k = 0;
		
		for (int i = 0; i < z; i++) {
			w = sc.nextInt();
			k = sc.nextInt();
			
			sb.append((w*k/2) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
