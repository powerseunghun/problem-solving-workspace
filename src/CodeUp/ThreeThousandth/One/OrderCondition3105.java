package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class OrderCondition3105 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		Integer[] arr = new Integer[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0, val = 0; i < arr.length; i++) {
			val = Integer.parseInt(st.nextToken());
			if (!map.containsKey(val)) {
				map.put(val, 1);
			}
			else map.put(val, map.get(val)+1);
			arr[i] = val;
		}
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (map.get(o1) < map.get(o2)) return 1;
				else if (map.get(o1) == map.get(o2)) {
					return o2 - o1;
				}
				else return -1;
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
