package Acmicpc.As.B3.TenThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FarmRobot13871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		int S = Integer.parseInt(tmp.split(" ")[2]);
		int cur = 1, cnt = 0;
		
		while (st.hasMoreTokens()) {
			if (cur == S) cnt++;
			cur += Integer.parseInt(st.nextToken());
			if (cur <= 0) cur = N;
			if (cur > N) cur = 1;
		}
		
		System.out.println(cur == S ? cnt+1 : cnt);
		br.close();
	}
}
