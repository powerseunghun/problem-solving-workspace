package Acmicpc.Sorting.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PhoneNumberList5052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] strs = null;
		boolean flag = false;
		int t = Integer.parseInt(br.readLine()), n = 0;
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			strs = new String[n];
			for (int j = 0; j < strs.length; j++) {
				strs[j] = br.readLine();
			}
			Arrays.sort(strs);
			flag = false;
			
			for (int j = 0; j < strs.length-1; j++) {
				if (strs[j+1].startsWith(strs[j])) {
					flag = true;
					sb.append("NO\n");
					break;
				}
			}
			if (!flag) sb.append("YES\n");
		}
		System.out.print(sb.toString());
	}
}
