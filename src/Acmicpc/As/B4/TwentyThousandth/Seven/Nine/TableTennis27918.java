package Acmicpc.As.B4.TwentyThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableTennis27918 {
	static char[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), s1 = 0, s2 = 0;
		arr = new char[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().charAt(0);
		}
		
		for (int el : arr) {
			if (el == 'D') {
				s1++;
			}
			else s2++;
			
			if (Math.abs(s1-s2) > 1) {
				break;
			}
		}
		
		System.out.println(s1 + ":" + s2);
		br.close();
	}
}
