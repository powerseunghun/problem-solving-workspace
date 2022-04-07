package Acmicpc.OrderSubmit.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TwoThousandthNine2948 {
	static int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
	static Map<Integer, Integer> map = new HashMap<>();
	static void init() {
		for (int i = 1; i <= arr.length; i++) {
			map.put(i, arr[i-1]);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int D = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		
		init();
		
		for (int i = 1; i <= M-1; i++) {
			sum += map.get(i);
		}
		sum += D-1;
		
		System.out.println(days[sum%7]);
		br.close();
	}
}
