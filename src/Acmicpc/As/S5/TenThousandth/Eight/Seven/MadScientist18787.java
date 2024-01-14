package Acmicpc.As.S5.TenThousandth.Eight.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MadScientist18787 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		String A = br.readLine();
		String B = br.readLine();
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			if (flag || A.charAt(i) != B.charAt(i)) {
				flag = true;
			}
			if (flag && A.charAt(i) == B.charAt(i)) {
				res++;
				flag = false;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
