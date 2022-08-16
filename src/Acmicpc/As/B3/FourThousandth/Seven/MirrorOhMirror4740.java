package Acmicpc.As.B3.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorOhMirror4740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuffer sbf = null;
		String str = null;
		
		while (true) {
			str = br.readLine();
			if (str.equals("***")) break;
			sbf = new StringBuffer(str);
			sb.append(sbf.reverse().toString() + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
