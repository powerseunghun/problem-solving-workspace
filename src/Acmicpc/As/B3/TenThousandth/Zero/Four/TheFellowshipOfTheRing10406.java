package Acmicpc.As.B3.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheFellowshipOfTheRing10406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int P = Integer.parseInt(tmp.split(" ")[2]), h = 0;
		
		while (st.hasMoreTokens()) {
			h = Integer.parseInt(st.nextToken());
			if (h < W || h > N) P--;
		}
		
		System.out.println(P);
		br.close();
	}
}
