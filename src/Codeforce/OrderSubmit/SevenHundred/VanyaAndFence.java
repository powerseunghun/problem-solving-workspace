package Codeforce.OrderSubmit.SevenHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VanyaAndFence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		
		while (st.hasMoreTokens()) {
			if (Integer.parseInt(st.nextToken()) > h) cnt++;
			cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
