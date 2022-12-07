package Acmicpc.As.B2.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookArrangement1434 {
	static int[] box = null, cap = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), idx = 0, b = 0, res = 0;
		
		box = new int[N];
		cap = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cap.length; i++) {
			cap[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			b = Integer.parseInt(st.nextToken());
			if (b <= (cap[idx]-box[idx])) {
				box[idx] += b;
			}
			else {
				while(idx < cap.length && (cap[idx]-box[idx] < b)) {
					idx++;
				}
				if (idx >= cap.length) break;
				box[idx] += b;
			}
		}
		for (int i = 0; i < cap.length; i++) {
			res += (cap[i]-box[i]);
		}
		
		System.out.println(res);
	}
}
