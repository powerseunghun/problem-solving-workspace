package Codeforce.OrderSubmit.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Presents {
	static Map<Integer, Integer> map = new HashMap<>();
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			map.put(arr[i], i+1);
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
