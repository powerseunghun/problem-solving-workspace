package Acmicpc.As.B3.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReportCardTime11367 {
	static String[] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A"};
	static String check(int N) {
		StringBuilder tmpSb = new StringBuilder();
		tmpSb.append(grade[N/10]);
		tmpSb.append((N >= 60 && N % 10 >= 7) || (N == 100) ? "+" : "");
		return tmpSb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			sb.append(tmp.split(" ")[0] + " " + check(Integer.parseInt(tmp.split(" ")[1])) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
