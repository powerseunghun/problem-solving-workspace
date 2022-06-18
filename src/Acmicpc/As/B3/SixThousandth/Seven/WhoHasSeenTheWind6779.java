package Acmicpc.As.B3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoHasSeenTheWind6779 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		boolean flag = false;
		
		for (int i = 1; i <= m; i++) {
			if (-6*Math.pow(i, 4) + h*Math.pow(i, 3) + Math.pow(i, 2) + i <= 0) {
				System.out.println("The balloon first touches ground at hour: " + i + "\n");
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("The balloon does not touch ground in the given time.\n");
		}
		br.close();
	}
}
