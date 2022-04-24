package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dubstep {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().replaceAll("WUB", " ").trim());
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			sb.append(st.nextToken());
			if (st.hasMoreTokens()) {
				sb.append(" ");
				continue;
			}
			break;
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
