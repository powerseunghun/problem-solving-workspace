package CodeUp.SHR.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LogAnalysize {
	static Map<Integer, Integer> map = new HashMap<>();
	static void mapInit() {
		String a = String.format("%08d", Integer.parseInt(Integer.toBinaryString(0)));
		String b = null;
		int count = 0;
		for (int i = 0; i <= 255; i++) {
			b = String.format("%08d", Integer.parseInt(Integer.toBinaryString(i)));
			count = 0;
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(j) != b.charAt(j)) count++;
			}
			if (!map.containsKey(Math.abs(i-0))) {
				map.put(Math.abs(i-0), count);
			}
		}
	}
	static int getDiff(String a, String b) {
		int t1 = Integer.parseInt(a);
		int t2 = Integer.parseInt(b);
		return map.get(Math.abs(t1 - t2));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String low = null, high = null, amb = null, tmp = null;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String[][] arr = null;
		mapInit();
		int T = Integer.parseInt(br.readLine()), L = 0, diff = 0;
		for (int i = 0; i < T; i++) {
			L = Integer.parseInt(br.readLine());
			diff = 0;
			if (L == 1) {
				low = br.readLine();
				high = br.readLine();
				amb = br.readLine();
				diff = getDiff(low, high) + getDiff(low, amb);
			}
			else {
				arr = new String[L][L];
				for (int j = 0; j < 3; j++) {
					st = new StringTokenizer(br.readLine(), "-");
					for (int k = 0; k < L; k++) {
						arr[j][k] = st.nextToken();
					}
				}
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < L; k++) {
						diff += getDiff(arr[0][j], arr[k][j]);
					}
				}
				diff -= 1;
			}
			System.out.println(diff);
		}
	}
}
