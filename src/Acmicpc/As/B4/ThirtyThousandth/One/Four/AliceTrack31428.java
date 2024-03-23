package Acmicpc.As.B4.ThirtyThousandth.One.Four;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class AliceTrack31428 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = br.readLine();
		int res = 0;
		
		while (st.hasMoreTokens()) {
			res += st.nextToken().equals(str) ? 1 : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
