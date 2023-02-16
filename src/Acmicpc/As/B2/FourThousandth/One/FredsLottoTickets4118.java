package Acmicpc.As.B2.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FredsLottoTickets4118 {
	static boolean check(ArrayList<Integer> list) {
		if (list.size() < 49) return false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != (i+1)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		int N = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			set.clear();
			list.clear();
			while (N-- > 0) {
				tmp = br.readLine();
				for (int i = 0; i < tmp.split(" ").length; i++) {
					set.add(Integer.parseInt(tmp.split(" ")[i]));
				}
			}
			list = new ArrayList<Integer>(set);
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
			Collections.sort(list);
			sb.append(check(list) ? "Yes" : "No").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
