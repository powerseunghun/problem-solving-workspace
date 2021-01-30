package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MakeSNS9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = null;
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		List<String> friendList = new ArrayList<>();
		Set<String> result = new HashSet<>();
		String name = "";
		
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		name = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			s = list.get(i).split(",");
			if (name.equals(s[0])) {
				for (int j = 3; j < s.length; j++) {
					friendList.add(s[j]);
					result.add(s[j]);
				}
			}
		}
		
		for (int i = 0; i < friendList.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				s = list.get(j).split(",");
				if (s[0].equals(friendList.get(i))) {
					for (int a = 3; a < s.length; a++) {
						if (!name.equals(s[a])) {
							result.add(s[a]);
						}
					}
				}
			}
		}
		
		System.out.println(result.size());
	}
}
