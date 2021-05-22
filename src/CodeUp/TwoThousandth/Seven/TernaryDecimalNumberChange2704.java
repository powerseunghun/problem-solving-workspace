package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TernaryDecimalNumberChange2704 {
	static void init(Map<Character, Integer> map) {
		for (int i = 0; i <= 9; i++) {
			map.put((char)(48+i), i);
		}
		for (int i = 10; i <= 32; i++) {
			map.put((char)(65+i-10), i);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<>();
		String[] arr = new String[Integer.parseInt(br.readLine())];
		init(map);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					for (int i = 0; i < o1.length(); i++) {
						if (map.get(o1.charAt(i)) > map.get(o2.charAt(i))) {
							return -1;
						}
						else if (map.get(o1.charAt(i)) == map.get(o2.charAt(i))) continue;
						else return 1;
					}
					return -1;
				}
				else if (o1.length() > o2.length()) return -1;
				else return 1;
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
