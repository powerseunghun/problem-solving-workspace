package Acmicpc.As.B3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TunnelEntranceExit5612 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int in = 0, out = 0, max = m;
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			in = Integer.parseInt(tmp.split(" ")[0]);
			out = Integer.parseInt(tmp.split(" ")[1]);
			m = m+in-out;
			
			max = (m < 0) ? 0 : Math.max(max, max);
			if (result == 0) break;
		}
		
		System.out.println(max);
		br.close();
	}
}
