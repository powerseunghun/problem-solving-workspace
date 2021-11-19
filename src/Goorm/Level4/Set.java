package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Set {
	static List<Integer> set = new ArrayList<>();
	static void add(int val) {
		if (!set.contains(val)) set.add(val); 
	}
	static void remove(int val) {
		if (set.contains(val)) {
			set.remove((Integer)val);
		}
	}
	static boolean check(int val) {
		if (set.contains(val)) return true;
		return false;
	}
	static void toggle(int val) {
		if (set.contains(val)) set.remove((Integer)val);
		else set.add(val);
	}
	static void all() {
		set.clear();
		for (int i = 1; i <= 20; i++) {
			set.add(i);
		}
	}
	static void empty() {
		set.clear();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0, val = 0; i < N; i++) {
			tmp = br.readLine();
			if (tmp.contains(" ")) val = Integer.parseInt(tmp.split(" ")[1]);
			switch(tmp.split(" ")[0]) {
			case "add":
				add(val);
				break;
			case "remove":
				remove(val);
				break;
			case "check":
				if (check(val)) sb.append("1\n");
				else sb.append("0\n");
				break;
			case "toggle":
				toggle(val);
				break;
			case "all":
				all();
				break;
			case "empty":
				empty();
				break;
			}
		}
		System.out.print(sb.toString());
	}
}
