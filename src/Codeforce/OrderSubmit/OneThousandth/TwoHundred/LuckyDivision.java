package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LuckyDivision {
	static int[] num = {4, 7};
	static Set<Integer> set = new HashSet<>();
	static void func(int n, int d, String str) {
		if (d >= n) return;
		if (!str.equals("")) {
			set.add(Integer.parseInt(str));
		}
		
		for (int i = 0; i < num.length; i++) {
			func(n, d+1, str + num[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 0;
		func(4, 0, "");
		
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			val = (int)iter.next();
			if (N % val == 0) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		br.close();
	}
}
