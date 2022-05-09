package Acmicpc.As.B4.TenThousandth.Six.Zero;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TelemarketerOrNot16017 {
	static int[] arr = new int[4];
	static boolean check() {
		for (int i = 0; i < arr.length; i++) {
			switch(i) {
			case 0: case 3:
				if (!(arr[i] == 8 || arr[i] == 9)) return false;
				break;
			}
		}
		return arr[1] == arr[2];
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(check() ? "ignore" : "answer");
		br.close();
	}
}
