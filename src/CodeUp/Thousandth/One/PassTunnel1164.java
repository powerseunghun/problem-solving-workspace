package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PassTunnel1164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String res = "PASS";
		
		while (st.hasMoreTokens()) {
			res = Integer.parseInt(st.nextToken()) <= 170 ? "CRASH" : res;
		}
		
		System.out.println(res);
	}
}
