package Acmicpc.As.B3.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Server10409 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(tmp.split(" ")[1]), cnt = 0, sum = 0, val = 0;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			sum += val;
			if (sum > T) break;
			cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
