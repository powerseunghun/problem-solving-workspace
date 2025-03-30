package Acmicpc.As.B2.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DangerousDive13627 {
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int R = Integer.parseInt(str.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		if (set.size() == N) {
			sb.append("*");
		}
		
		for (int i = 1; i <= N; i++) {
			if (!set.contains(i)) {
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
