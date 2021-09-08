package SWExpertAcademy.D3.TenThousandth.One.Seven;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BinaryExpression10726 {
	static boolean check(String str, int N) {
		for (int i = str.length()-1; i >= str.length()-N; i--) {
			if (str.charAt(i) == '0') return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, be = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			be = Integer.toBinaryString(M);
			
			if (be.length() < N) {
				sb.append("#" + i + " OFF\n");
				continue;
			}
			else {
				if (check(be, N)) sb.append("#" + i + " ON\n");
				else sb.append("#" + i + " OFF\n");
			}
		}
		System.out.print(sb.toString());
	}
}
