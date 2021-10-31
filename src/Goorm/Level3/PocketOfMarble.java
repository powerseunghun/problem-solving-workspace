package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class PocketOfMarble {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 0, val = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		Map<Long, Integer> map = new HashMap<>();
		long[] arr = new long[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else map.put(arr[i], map.get(arr[i])+1);
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum -= arr[i];
			if (sum % 2 == 0) {
				val = sum/2;
				if (map.containsKey(val)) {
					if (val == arr[i]) {
						if (map.get(val)>1) {
							list.add(i+1);
						}
					}
					else list.add(i+1);
				}
			}
			sum += arr[i];
		}
		
		System.out.println(list.size());
		
		if (list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
