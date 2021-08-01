package Acmicpc.DataStructure.TenThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

// c3 essential problem
public class LocationCompression18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		Set<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		
		Object[] arr2 = set.toArray();
		Arrays.sort(arr2);
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i])) map.put((int)arr2[i], i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		
		System.out.print(sb.toString());
	}
}
