package Acmicpc.As.B4.ThirtyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoSchool31962 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int X = Integer.parseInt(str.split(" ")[1]), S = 0, T = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			S = Integer.parseInt(str.split(" ")[0]);
			T = Integer.parseInt(str.split(" ")[1]);
			if (S+T <= X) {
				list.add(S);
			}
		}
		Collections.sort(list);
		System.out.println(list.isEmpty() ? "-1" : list.get(list.size()-1));
		br.close();
	}
}
