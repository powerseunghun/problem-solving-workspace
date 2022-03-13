package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SequenceSorting1015 {
	static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
	static int[] idxList = new int[1001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N], arr2 = new int[N];
		
		for (int i = 0, n = 0; i < arr.length; i++) {
			n = Integer.parseInt(st.nextToken());
			arr[i] = n;
			arr2[i] = n;
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> tmp = !map.containsKey(arr[i]) ? new ArrayList<>() : map.get(arr[i]);
			tmp.add(i);
			map.put(arr[i], tmp);
		}
		
		for (int el : arr2) {
			sb.append(map.get(el).get(idxList[el]++) + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
