package Acmicpc.As.B1.FourThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ToAndFro4246 {
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int N = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			str = br.readLine();
			list.clear();
			
			for (int i = 0; i < str.length(); i+=N) {
				list.add(str.substring(i, i+N));
			}
			
			for (int i = 0, w = N-1; i < N; i++, w--) {
				for (int j = 0; j < list.size(); j++) {
					String kStr = list.get(j);
					sb.append(j % 2 == 0 ? kStr.charAt(i) : kStr.charAt(w));
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
