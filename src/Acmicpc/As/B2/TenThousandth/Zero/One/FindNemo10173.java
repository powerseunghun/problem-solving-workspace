package Acmicpc.As.B2.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FindNemo10173 {
	static final String target = "NEMO";
	static Set<String> set = new HashSet<>();
	static char[] arr = new char[target.length()];
	static boolean[] check = new boolean[target.length()];
	static void func(int n, int d) {
		if (d >= n) {
			String str = "";
			for (char c : arr) {
				str += c;
			}
			set.add(str);
			return;
		}
		
		arr[d] = target.charAt(d);
		func(n, d+1);
		arr[d] = (char)(target.charAt(d) + 32);
		func(n, d+1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		boolean flag = false;
		func(target.length(), 0);
		
		while (true) {
			str = br.readLine();
			if (str.equals("EOI")) break;
			flag = false;
			for (String s : set) {
				if (str.contains(s)) {
					flag = true;
					break;
				}
			}
			sb.append(flag ? "Found" : "Missing").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
