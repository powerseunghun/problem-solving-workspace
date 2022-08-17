package Acmicpc.As.B3.TenThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MilkFestival14720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idx = 0, cnt = 0;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			if (Integer.parseInt(st.nextToken()) == idx) {
				cnt++;
				idx++;
				idx %= 3;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}
