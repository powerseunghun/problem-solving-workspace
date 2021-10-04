package LettCode.Hundred.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P13RomanToInteger {
	static int romanToInt(String s) {
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add(map.get(s.charAt(i)));
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size()-1) sum += list.get(i);
			else if (list.get(i) >= list.get(i+1)) sum += list.get(i);
			else if (list.get(i) < list.get(i+1)) sum -= list.get(i);
		}
        return sum;
    }
	static void mapInit() {
		map.put('I', 1); map.put('V', 5); map.put('X', 10);
		map.put('L', 50); map.put('C', 100); map.put('D', 500);
		map.put('M', 1000);
	}
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		mapInit();
		System.out.println(romanToInt("MCMXCIV"));
	}
}
