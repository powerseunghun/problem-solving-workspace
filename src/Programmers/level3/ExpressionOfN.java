package Programmers.level3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExpressionOfN {
	static List<HashSet<Integer>> list = new ArrayList<>();
	static void listInit() {
		for (int i = 0; i < 9; i++) {
			list.add(new HashSet<Integer>());
		}
	}
	static Set<Integer> get(int n, int number) {
		if (list.get(n).size() > 0) return list.get(n);
		
		int val = 0;
		for (int i = 0; i < n; i++) {
			val = 10 * val + number;
		}
		
		list.get(n).add(val);
		
		for (int i = 1; i < n; i++) {
			HashSet<Integer> set1 = list.get(i);
			HashSet<Integer> set2 = list.get(n-i);
			
			for (int n1 : set1) {
				for (int n2 : set2) {
					list.get(n).add(n1+n2);
					list.get(n).add(n1-n2);
					list.get(n).add(n1*n2);
					if (n2 != 0) list.get(n).add(n1/n2);
				}
			}
		}
		return list.get(n);
	}
	static int solution(int N, int number) {
        listInit();
        for (int i = 1; i < 9; i++) {
        	get(i, N);
        	if (list.get(i).contains(number)) return i;
        }
        
        return -1;
    }
	public static void main(String[] args) {
		int N = 5, number = 12;
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		
		System.out.println(solution(N, number));
	}
}
