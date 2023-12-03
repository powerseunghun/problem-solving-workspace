package Acmicpc.As.S5.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class RoomNumber5671 {
	static Set<Character> set = new HashSet<Character>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String str = null, rn = null;
		int N = 0, M = 0, res = 0;
		
//		while((str = br.readLine()) != null) {
		while (true) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			if (N == 0 && M == 0) break;
			
			res = 0;
			for (int i = N; i <= M; i++) {
				rn = String.valueOf(i);
				set.clear();
				for (int j = 0; j < rn.length(); j++) {
					char c = rn.charAt(j);
					if (set.contains(c)) {
						res++;
						break;
					}
					set.add(c);
				}
			}
			sb.append((M-N+1) - res).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
