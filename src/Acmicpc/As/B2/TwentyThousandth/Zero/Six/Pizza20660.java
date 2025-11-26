package Acmicpc.As.B2.TwentyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pizza20660 {
	static boolean func(Set<Integer> set, Set<Integer> set2) {
		for (int el : set2) {
			if (set.contains(el)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]), m = 0, k = 0, res = 0;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 1; i < str.split(" ").length; i++) {
			set.add(Integer.parseInt(str.split(" ")[i]));
		}
		
		m = Integer.parseInt(br.readLine());
		
		while(m-- > 0) {
			Set<Integer> set2 = new HashSet<>();
			str = br.readLine();
			k = Integer.parseInt(str.split(" ")[0]);
			
			for (int i = 1; i < str.split(" ").length; i++) {
				set2.add(Integer.parseInt(str.split(" ")[i]));
			}
			res = func(set, set2) ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
