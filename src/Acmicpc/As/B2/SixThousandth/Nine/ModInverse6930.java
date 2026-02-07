package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModInverse6930 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine()), res = 0;
		boolean flag = false;
		
		for (int i = 1, v = 0; i <= 1000; i++) {
			v = m*i+1;
			if (v % x != 0) {
				continue;
			}
			res = v/x;
			flag = true;
			break;
		}
		
		System.out.println(flag ? res : "No such integer exists.");
		br.close();
	}
}
