package Acmicpc.As.B3.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HawkEyes13698 {
	static int[] cmd1 = {0, 0, 0, 1, 1, 2};
	static int[] cmd2 = {1, 2, 3, 2, 3, 3};
	static int[] arr = {-1, 0, 0, 1};
	static Map<Integer, Integer> map = new HashMap<>();
	static void swip(char c) {
		int idx = c-65, tmp = arr[cmd1[idx]];
		arr[cmd1[idx]] = arr[cmd2[idx]];
		arr[cmd2[idx]] = tmp;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			swip(str.charAt(i));
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			map.put(arr[i], i+1);
		}
		
		System.out.println(map.get(-1));
		System.out.println(map.get(1));
		br.close();
	}
}
