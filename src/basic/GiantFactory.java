package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GiantFactory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> machine = new HashMap<>();
		int n;
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			machine.put(sc.nextInt(), sc.nextInt());
		}
		
		List keySet = new ArrayList(machine.keySet());
		Collections.sort(keySet);
		
		for (int i = 0; i < keySet.size(); i++) {
			System.out.println(keySet.get(i) + " " + machine.get(keySet.get(i)));
		}
	}
}
