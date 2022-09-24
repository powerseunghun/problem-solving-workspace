package Acmicpc.As.B3.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CowRouting10675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int N = Integer.parseInt(tmp.split(" ")[2]);
		int res = Integer.MAX_VALUE;
		boolean flag1 = false, flag2 = false;
		
		for (int i = 0, cost = 0, v = 0; i < N; i++) {
			tmp = br.readLine();
			cost = Integer.parseInt(tmp.split(" ")[0]);
			v = Integer.parseInt(tmp.split(" ")[1]);
			st = new StringTokenizer(br.readLine());
			flag1 = false;
			flag2 = false;
			for (int j = 0, val = 0; j < v; j++) {
				val = Integer.parseInt(st.nextToken());
				if (val == A) flag1 = true;
				if (flag1 && val == B) flag2 = true;
				
				res = (flag1 && flag2) ? Math.min(res, cost) : res;
			}
		}
		
		System.out.println(res == Integer.MAX_VALUE ? "-1" : res);
		br.close();
	}
}
