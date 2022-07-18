package Acmicpc.As.B4.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommunicationChannels11121 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null, i = null, o = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			i = tmp.split(" ")[0];
			o = tmp.split(" ")[1];
			sb.append(i.equals(o) ? "OK\n" : "ERROR\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
