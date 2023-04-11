package Acmicpc.As.B2.TwentyThousandth.Five.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Navigation25558 {
	static long[] arr = new long[4];
	static long[] dist = new long[2];
	static long getDist(long a, long b, long c, long d) {
		return Math.abs(a-c) + Math.abs(b-d);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = 0;
		long sum = 0, min = Long.MAX_VALUE, res = 0, curX = 0, curY = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tmp = null;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		for (int i = 1; i <= N; i++) {
			M = Integer.parseInt(br.readLine());
			sum = 0;
			while (M-- > 0) {
				tmp = br.readLine();
				dist[0] = Long.parseLong(tmp.split(" ")[0]);
				dist[1] = Long.parseLong(tmp.split(" ")[1]);
				if (sum == 0) {
					sum += getDist(arr[0], arr[1], dist[0], dist[1]);
				}
				else {
					sum += getDist(curX, curY, dist[0], dist[1]);
				}
				curX = dist[0];
				curY = dist[1];
			}
			sum += getDist(curX, curY, arr[2], arr[3]);
			
			if (sum < min) {
				res = i;
				min = sum;
			}
		}
		System.out.println(res);
		br.close();
	}
}
