package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Taxi {
	static int[] cnt = new int[5];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, d = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			cnt[val]++;
		}
		a = cnt[4]; b = cnt[3];
		if (cnt[3] >= cnt[1]) cnt[1] = 0;
		else cnt[1] -= b;
		c = cnt[2] / 2;
		if (cnt[2] % 2 != 0) {
			c++;
			if (cnt[1] + 2 <= 4) cnt[1] = 0;
			else cnt[1] -= 2;
		}
		d = cnt[1] / 4;
		if (cnt[1] % 4 != 0) d++;
		
		System.out.println(a+b+c+d);
		br.close();
		
//		cnt[1] = Math.max(cnt[1]-(cnt[2]%2)*2-cnt[3], 0);
//		System.out.println(cnt[4]+cnt[3]+Math.ceil(cnt[2]/2)+Math.ceil(cnt[1]/4));
		br.close();
	}
}
