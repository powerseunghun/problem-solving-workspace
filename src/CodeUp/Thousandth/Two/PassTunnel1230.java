package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PassTunnel1230 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tmp = 0, h = 0;
		String res = "PASS";
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			res = tmp <= 170 ? "CRASH" : res;
			if (res.equals("CRASH")) {
				res += " " + tmp;
				break;
			}
		}
		System.out.println(res);
	}
}
