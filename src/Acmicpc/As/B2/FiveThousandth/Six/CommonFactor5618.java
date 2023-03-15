package Acmicpc.As.B2.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CommonFactor5618 {
	static int getGCD(int a, int b) {
		if (b == 0) return a;
		return getGCD(b, a%b);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = 0, b = 0;
		while (st.hasMoreTokens()) {
			if (a == 0) {
				a = Integer.parseInt(st.nextToken());
				continue;
			}
			b = Integer.parseInt(st.nextToken());
			a = getGCD(a, b);
		}
		
		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				if (Math.pow(i, 2) == a) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(a/i);
				}
			}
		}
		Collections.sort(list);
		
		for (int el : list) {
			sb.append(el).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
