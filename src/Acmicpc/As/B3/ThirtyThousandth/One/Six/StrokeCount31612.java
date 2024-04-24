package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StrokeCount31612 {
	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static void mapInit() {
		String k = "joi";
		int[] arr = {2,1,2};
		for (int i = 0; i < Math.min(k.length(), arr.length); i++) {
			map.put(k.charAt(i), arr[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int res = 0;
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			res += map.get(str.charAt(i));
		}
		
		System.out.println(res);
		br.close();
	}
}
