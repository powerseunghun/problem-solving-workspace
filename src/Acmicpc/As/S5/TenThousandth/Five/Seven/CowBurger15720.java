package Acmicpc.As.S5.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CowBurger15720 {
	static List<Integer> b = new ArrayList<>();
	static List<Integer> c = new ArrayList<>();
	static List<Integer> d = new ArrayList<>();
	static final int len = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int tRes = 0, res = 0;
		
		for (int i = 0; i < len; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if (i == 0) {
					b.add(Integer.parseInt(st.nextToken()));
				}
				else if (i == 1) {
					c.add(Integer.parseInt(st.nextToken()));
				}
				else {
					d.add(Integer.parseInt(st.nextToken()));
				}
			}
		}
		Collections.sort(b, Collections.reverseOrder());
		Collections.sort(c, Collections.reverseOrder());
		Collections.sort(d, Collections.reverseOrder());
		
		for (int i = 0; i < Math.max(b.size(), Math.max(c.size(), d.size())); i++) {
			int cnt = 0;
			int pSum = 0;
			if (i < b.size()) {
				pSum += b.get(i);
				cnt++;
			}
			if (i < c.size()) {
				pSum += c.get(i);
				cnt++;
			}
			if (i < d.size()) {
				pSum += d.get(i);
				cnt++;
			}
			tRes += pSum;
			res += cnt == len ?  (int)((double)pSum * 0.9) : pSum;
		}
		
		System.out.println(tRes);
		System.out.println(res);
		br.close();
	}
}
