package Acmicpc.OrderSubmit.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RealSpace1350 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long res = 0, val = 0, c = Long.parseLong(br.readLine());
		
		while (st.hasMoreTokens()) {
			val = Long.parseLong(st.nextToken());
			if (val == 0) continue;
			res += (val / c);
			if (val % c != 0) res++;
		}
		
		System.out.println(c * res);
		br.close();
	}
}
