package Acmicpc.As.B2.SixThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedReading6139 {
	static int func(int N, String tmp) {
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int t = Integer.parseInt(tmp.split(" ")[1]);
		int r = Integer.parseInt(tmp.split(" ")[2]);
		int res = 0, cnt = 0, st = 0;
		st = s*t;
		
		while (true) {
			if (N-cnt <= st) {
				res += Math.ceil((N-cnt)/(double)s);
				break;
			}
			cnt += st;
			res += t+r;
		}
		return res;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		
		while(K-- > 0) {
			tmp = br.readLine();
			sb.append(func(N, tmp)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
