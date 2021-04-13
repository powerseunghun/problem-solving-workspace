package Acmicpc.Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnderX10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]), X = Integer.parseInt(tmp.split(" ")[1]), n = 0;
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			n = Integer.parseInt(st.nextToken());
			if (n < X) {
				sb.append(n + " ");
			}
		}
		sb.append("\n");
		
		System.out.println(sb);
	}
}
