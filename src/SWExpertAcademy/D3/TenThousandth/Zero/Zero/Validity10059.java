package SWExpertAcademy.D3.TenThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validity10059 {
	static String check(String str) {
		int n1 = Integer.parseInt(str.substring(0, 2));
		int n2 = Integer.parseInt(str.substring(2, 4));
		String ans = null;
		
		if ((n1 >= 1 && n1 <= 12) && (!(n2 >= 1 && n2 <= 12))) {
			ans = "MMYY";
		}
		else if ((n2 >= 1 && n2 <= 12) && (!(n1 >= 1 && n1 <= 12))) {
			ans = "YYMM";
		}
		else if ((n1 >= 1 && n1 <= 12) && (n2 >= 1 && n2 <= 12)) {
			ans = "AMBIGUOUS";
		}
		else ans = "NA";
		return ans;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			sb.append("#" + i + " " + check(str) + "\n");
		}
		System.out.print(sb.toString());
	}
}
