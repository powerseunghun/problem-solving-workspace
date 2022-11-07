package Acmicpc.As.B3.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalloonsColors9635 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, X = 0, Y = 0, val = 0;
		boolean flag1 = false, flag2 = false;
		StringTokenizer st = null;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			X = Integer.parseInt(tmp.split(" ")[1]);
			Y = Integer.parseInt(tmp.split(" ")[2]);
			st = new StringTokenizer(br.readLine());
			flag1 = false;
			flag2 = false;
			for (int i = 1; i <= N; i++) {
				val = Integer.parseInt(st.nextToken());
				if (i == 1 && val == X) flag1 = true;
				if (i == N && val == Y) flag2 = true;
			}
			
			if (flag1 && flag2) sb.append("BOTH\n");
			else if (flag1 && !flag2) sb.append("EASY\n");
			else if (!flag1 && flag2) sb.append("HARD\n");
			else sb.append("OKAY\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
