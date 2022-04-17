package Codeforce.OrderSubmit.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BeautifulYear {
	static Set<Character> set = new HashSet<>();
	static boolean check(String str) {
		set.clear();
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				continue;
			}
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		
		for (int i = year+1; ; i++) {
			if (check(i+"")) {
				System.out.println(i);
				break;
			}
		}
		br.close();
	}
}
