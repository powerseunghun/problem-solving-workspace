package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GetTwoNumbersDivisorLarge2055 {
	static Set<Integer> list = new HashSet<>();
	static void addDivisor(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (Math.sqrt(n) == i) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(n / i);
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<Integer> sortList = null;
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		addDivisor(a);
		addDivisor(b);
		sortList = new ArrayList(list);
		
		Collections.sort(sortList);
		for (int i = 0; i < sortList.size(); i++) {
			System.out.print(sortList.get(i) + " ");
		}
		
	}
}
