package Acmicpc.As.B4.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheMerchantOfVenice13496 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(br.readLine()), n = 0, s = 0, d = 0, di = 0, vi = 0, sum = 0;
		String tmp = null;
		
		for (int t = 1; t <= x; t++) {
			sb.append("Data Set " + t + ":\n");
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			s = Integer.parseInt(tmp.split(" ")[1]);
			d = Integer.parseInt(tmp.split(" ")[2]);
			sum = 0;
			for (int i = 0, res = 0; i < n; i++) {
				tmp = br.readLine();
				di = Integer.parseInt(tmp.split(" ")[0]);
				vi = Integer.parseInt(tmp.split(" ")[1]);
				res = (di % s == 0) ? di/s : (di/s)+1;
				if (res <= d) sum += vi;
			}
			sb.append(sum + "\n");
			if (t == x) continue;
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
