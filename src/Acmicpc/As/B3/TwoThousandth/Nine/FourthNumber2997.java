package Acmicpc.As.B3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FourthNumber2997 {
	static Map<Integer, Integer> map = new HashMap<>();
	static int[] arr = new int[3];
	static int[] diff = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			map.put(arr[i], 1);
		}
		Arrays.sort(arr);
		for (int i = 0; i < diff.length; i++) {
			diff[i] = arr[i+1] - arr[i];
		}
		diff[0] = diff[0] != diff[1] ? (diff[0]+diff[1]) / 3 : (diff[0]+diff[1]) / 2;
		
		for (int el : arr) {
			if (!map.containsKey(el+diff[0])) {
				res = el+diff[0];
				break;
			}
		}
		
		System.out.println(res == Integer.MAX_VALUE ? arr[2] + diff[0] : res);
		br.close();
	}
}
