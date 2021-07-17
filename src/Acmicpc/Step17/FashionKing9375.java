package Acmicpc.Step17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FashionKing9375 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), n2 = 0, sum = 1;
		String tmp = "";
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			n2 = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < n2; j++) {
				tmp = sc.nextLine();
				String[] tmps = tmp.split(" ");
				
				if (!map.containsKey(tmps[1])) {
					map.put(tmps[1], 1);
				}
				else {
					map.put(tmps[1], map.get(tmps[1]) + 1);
				}
			}
			Iterator iter = map.keySet().iterator();
			while(iter.hasNext()) {
				sum *= (map.get(iter.next()) + 1);
			}
			System.out.println(sum - 1);
			sum = 1;
			map.clear();
		}
	}
}
