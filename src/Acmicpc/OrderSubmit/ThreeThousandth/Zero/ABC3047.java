package Acmicpc.OrderSubmit.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ABC3047 {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			map.put((char)('A'+i), arr[i]);
		}
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(map.get(str.charAt(i)) + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
