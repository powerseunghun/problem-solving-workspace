package Acmicpc.OrderSubmit.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TGN5063 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		boolean flag = false;
		
		for (int i = 0, r = 0, e = 0, c = 0; i < N; i++) {
			tmp = br.readLine();
			r = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			flag = r == (e-c);
			if (flag) {
				sb.append("does not matter\n");
				continue;
			}
			sb.append(r > (e-c) ? "do not advertise\n" : "advertise\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
