package SWExpertAcademy.D3.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteDictionary11445 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s1 = null, s2 = null;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			s1 = br.readLine();
			s2 = br.readLine();
			if ((s1 += "a").equals(s2)) sb.append("#" + i + " N\n");
			else sb.append("#" + i + " Y\n");
		}
		
		System.out.print(sb.toString());
	}
}
