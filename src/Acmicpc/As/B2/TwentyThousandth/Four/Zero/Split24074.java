package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Split24074 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		StringTokenizer st = null;
		int v = 0;
		
		for (int i = 0, kVal = 0; i < str.split(" ").length; i++) {
			kVal = Integer.parseInt(str.split(" ")[i]);
			v = Math.max(v, kVal);
		}
		st = new StringTokenizer(str, "");
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		br.close();
	}
}
