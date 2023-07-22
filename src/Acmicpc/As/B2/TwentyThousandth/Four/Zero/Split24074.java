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
		int v = 0, pm = 0, res1 = 0, res2 = 0;
		boolean flag = true;
		
		for (int i = 0, kVal = 0; i < str.split(" ").length; i++) {
			kVal = Integer.parseInt(str.split(" ")[i]);
			v = Math.max(v, kVal);
		}
		st = new StringTokenizer(str);
		
		
		while(st.hasMoreTokens()) {
			pm = Integer.parseInt(st.nextToken());
			if (v == pm) {
				flag = false;
				continue;
			}
			if(flag) res1 += pm;
			else res2 += pm;
		}
		
		System.out.println(res1);
		System.out.println(res2);
		br.close();
	}
}
