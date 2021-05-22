package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tunnel2701 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), min = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		min = Math.abs(X - Integer.parseInt(st.nextToken()));
		while(st.hasMoreTokens()) {
			int tmp = Integer.parseInt(st.nextToken());
			min = min < Math.abs(X - tmp) ? min : Math.abs(X - tmp);
		}
		
		System.out.println(min);
	}
}
