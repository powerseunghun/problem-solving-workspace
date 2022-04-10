package Codeforce.OrderSubmit.Hundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			if (tmp.length() > 10) {
				sb.append(tmp.charAt(0));
				sb.append(tmp.length()-2);
				sb.append(tmp.charAt(tmp.length()-1));
			}
			else sb.append(tmp);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
