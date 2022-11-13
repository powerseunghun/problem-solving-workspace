package Acmicpc.As.B3.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Terraforming25278 {
	static int[] arr = new int[3];
	static Map<String, Integer> map = new HashMap<>();
	static void init() {
		String[] strs = {"ocean", "oxygen", "temperature"};
		for (int i = 0; i < strs.length; i++) {
			map.put(strs[i], i);
		}
		arr[map.get("temperature")] = -30;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0;
		String tmp = null;
		
		init();
		while (N-- > 0) {
			tmp = br.readLine();
			arr[map.get(tmp.split(" ")[0])] += (tmp.split(" ")[1].charAt(1) -'0');
		}
		
		System.out.println((arr[0] >= 9 && arr[1] >= 14 && arr[2] >= 8) ? "liveable" : "not liveable");
		br.close();
	}
}
