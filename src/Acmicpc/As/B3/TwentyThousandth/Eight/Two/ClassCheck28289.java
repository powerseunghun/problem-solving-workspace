package Acmicpc.As.B3.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassCheck28289 {
	static final int l = 3;
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine()), g = 0, c = 0, n = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		arr = new int[P][l];
		String str = null;
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			g = Integer.parseInt(str.split(" ")[0]);
			c = Integer.parseInt(str.split(" ")[1]);
			n = Integer.parseInt(str.split(" ")[2]);
			arr[i][0] = g;
			arr[i][1] = c;
			arr[i][2] = n;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] <= 1) {
				r4++;
				continue;
			}
			if (arr[i][1] <= 2) {
				r1++;
			}
			else if (arr[i][1] <= 3) {
				r2++;
			}
			else if (arr[i][1] <= 4) {
				r3++;
			}
		}
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		br.close();
	}
}
