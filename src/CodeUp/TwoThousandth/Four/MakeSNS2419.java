package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MakeSNS2419 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = null;
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> friendList = new ArrayList<>();
		Set<String> result = new HashSet<>();
		String name = null;
		
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		name = br.readLine();
		
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
