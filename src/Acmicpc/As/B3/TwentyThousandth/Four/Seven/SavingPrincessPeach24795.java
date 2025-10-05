package Acmicpc.As.B3.TwentyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SavingPrincessPeach24795 {
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int X = Integer.parseInt(str.split(" ")[0]);
		int Y = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		while(Y-- > 0) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		for (int i = 0; i < X; i++) {
			if (set.contains(i)) {
				res++;
				continue;
			}
			sb.append(i).append("\n");
		}
		sb.append("Mario got ").append(res).append(" of the dangerous obstacles.");
		
		System.out.println(sb.toString());
		br.close();
	}
}
