package Acmicpc.As.B2.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AbsExam23320 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, v = 0, res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = br.readLine();
		a = Integer.parseInt(str.split(" ")[0]);
		b = Integer.parseInt(str.split(" ")[1]);
		a = (int) ((double)N * a / 100);
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			res = v >= b ? res + 1 : res;
		}
		
		System.out.println(a + " " + res);
		br.close();
	}
}
