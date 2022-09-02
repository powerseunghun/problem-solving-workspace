package Acmicpc.As.B3.TenThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BabyBites16316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = 0, target = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tmp = null;
		
		for (int i = 1; i <= N; i++) {
			tmp = st.nextToken();
			if (tmp.equals("mumble")) continue;
			if (Integer.parseInt(tmp) != i) {
				idx = i;
				break;
			}
		}
		
		System.out.println(idx > 0 ? "something is fishy" : "makes sense");
		br.close();
	}
}
