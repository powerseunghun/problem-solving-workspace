package Acmicpc.As.B2.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1173 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int M = Integer.parseInt(tmp.split(" ")[2]);
		int T = Integer.parseInt(tmp.split(" ")[3]);
		int R = Integer.parseInt(tmp.split(" ")[4]);
		int mb = m, t = 0, ex = 0;
		
		for (t = 0; ; t++) {
			if (m+T > M) break;
			if (ex == N) break;
			if (mb + T <= M) {
				mb += T;
				ex++;
			}
			else {
				mb -= R;
				mb = mb < m ? m : mb;
			}
		}
		
		System.out.println(ex == N ? t : -1);
		br.close();
	}
}
