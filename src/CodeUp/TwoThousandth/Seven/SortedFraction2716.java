package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SortedFraction2716 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	static void addSet(int N, Set<String> set) {
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= i; j++) {
				String tmp = ((j / GCD(i, j)) + "/" + (i / GCD(i, j)));
				set.add(tmp);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		ArrayList<String> list = null;
		
		addSet(N, set);
		list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int s1 = Integer.parseInt(o1.split("/")[0]);
				int m1 = Integer.parseInt(o1.split("/")[1]);
				int s2 = Integer.parseInt(o2.split("/")[0]);
				int m2 = Integer.parseInt(o2.split("/")[1]);
				
				if ((s1/(double)m1) > (s2/(double)m2)) return 1;
				else return -1;
			}
		});
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
