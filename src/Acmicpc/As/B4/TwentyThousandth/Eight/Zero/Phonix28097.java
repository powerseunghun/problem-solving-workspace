package Acmicpc.As.B4.TwentyThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Phonix28097 {
	static final int h = 24;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		sum += (8 * (N-1));
		
		System.out.println(sum / h + " " + sum % h);
		br.close();
	}
}
