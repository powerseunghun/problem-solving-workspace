package Acmicpc.As.B5.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PalindromeDigit11068 {
	static final int s = 2, e = 64;
	static List<Integer> list = new ArrayList<Integer>();
	static boolean check(int N, int d) {
		list.clear();
		
		while(N != 0) {
			list.add(N%d);
			N /= d;
		}
		for (int i = 0, j = list.size()-1; i <= j; i++, j--) {
			if (list.get(i) != list.get(j)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		boolean flag = true;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			flag = false;
			for (int i = s; i <= e; i++) {
				flag = check(N, i);
				if (flag) break;
			}
			sb.append(flag ? "1" : "0").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
