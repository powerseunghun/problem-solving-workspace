package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> ans = new HashSet<>();
		Map<Character, Integer> check = new HashMap<>();
		boolean flag = true;
		String s = br.readLine();
		for (int a = 0; a < s.length(); a++) {
			for (int i = a+1; i <= s.length(); i++) {
				String tmp = s.substring(a, i);
				if (tmp.length() == 1) {
					ans.add(tmp);
				}
				else if (tmp.length() == 2) {
					if(tmp.charAt(0) != tmp.charAt(1)) {
						ans.add(tmp);
					}
				}
				// 3이상
				else {
					flag = true;
					check.clear();
					System.out.println("tmp : " + tmp);
					for(int b = 0; b < tmp.length(); b++) {
						System.out.println(tmp.charAt(b));
						if(check.containsKey(tmp.charAt(b))) {
							flag = false;
							break;
						}
						else {
							check.put(tmp.charAt(b), 1);
						}
					}
					if (flag) {
						ans.add(tmp);
					}
				}
			}
		}
		
		Iterator iter = ans.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(ans.size());
	}
}
