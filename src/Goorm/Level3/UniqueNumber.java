package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class UniqueNumber {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (!map.containsKey(arr[i])) map.put(arr[i], 1);
			else map.put(arr[i], map.get(arr[i])+1);
		}
		
		Iterator iter = map.keySet().iterator();
		
		while (iter.hasNext()) {
			int key = (int) iter.next();
			if (map.get(key) % 2 != 0) {
				System.out.println(key);
				return;
			}
		}
		
		br.close();
	}
}
