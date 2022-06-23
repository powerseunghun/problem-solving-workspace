package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Monety8714 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fCnt = 0, bCnt = 0;
		
		while (st.hasMoreTokens()) {
			if (Integer.parseInt(st.nextToken()) != 0) fCnt++;
			else bCnt++;
		}
		
		System.out.println(Math.min(fCnt, bCnt));
		br.close();
	}
}
