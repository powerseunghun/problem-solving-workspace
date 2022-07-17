package Acmicpc.As.B3.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeKangaroo11034 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int A = 0, B = 0, C = 0, jump = 0;
		int l = 0, r = 0 ;
		
		while ((tmp = br.readLine()) != null) {
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			jump = 0;
			while (!(Math.abs(B-A) == 1 && Math.abs(C-B) == 1)) {
				l = B-A;
				r = C-B;
				if (l < r) {
					A = B;
					B++;
				}
				else {
					C = B;
					B--;
				}
				jump++;
			}
			sb.append(jump + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
