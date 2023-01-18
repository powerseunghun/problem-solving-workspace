package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Scale26583 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> tList = null;
		String str = null;
		
		while((str=br.readLine()) != null) {
			tList = new ArrayList<>();
			tList.add(1);
			for (int i = 0; i < str.split(" ").length; i++) {
				tList.add(Integer.parseInt(str.split(" ")[i]));
			}
			tList.add(1);
			list.add(tList);
		}
		
		for (int i = 0; i < list.size(); i++) {
			tList = list.get(i);
			for (int j = 1, val = 0; j < tList.size()-1; j++) {
				val = tList.get(j-1) * tList.get(j) * tList.get(j+1);
				sb.append(val);
				if (j == tList.size()-1) continue;
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
