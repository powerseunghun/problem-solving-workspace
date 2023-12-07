package Acmicpc.As.S5.TenThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Decriptor17176 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = null;
		List<Character> list = new ArrayList<Character>();
		int v = 0;
		boolean flag = true;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (v == 0) {
				list.add(' ');
				continue;
			}
			list.add((v >= 1 && v <= 26) ? (char)(v+64) : (char)(v+70));
		}
		str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			if (list.contains(str.charAt(i))) {
				list.remove(list.indexOf(str.charAt(i)));
				continue;
			}
			else {
				flag = false;
				break;
			}
		}
		
		System.out.println((!flag || !list.isEmpty()) ? "n" : "y");
		br.close();
	}
}
