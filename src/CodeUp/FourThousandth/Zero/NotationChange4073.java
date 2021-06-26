package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NotationChange4073 {
	static void init() {
		for (int i = 0; i < 10; i++) {
			map.put(i, i+"");
		}
		for (int i = 10; i <= 35; i++) {
			map.put(i, ((char)(i+55))+"");
		}
	}
	static String get(int n, int s) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(map.get(n%s));
			n /= s;
		}
		return sb.reverse().toString();
	}
	static Map<Integer, String> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		init();
		
		while (st.hasMoreTokens()) {
			int s = Integer.parseInt(st.nextToken());
			sb.append(get(n, s) + " ");
		}
		System.out.println(sb.toString());
	}
}
