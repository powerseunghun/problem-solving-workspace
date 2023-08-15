package Acmicpc.As.B1.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sequence1551 {
	static List<Integer> list = new ArrayList<>();
	static List<Integer> tmpList = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int K = Integer.parseInt(str.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		while(K-- > 0) {
			tmpList.clear();
			for (int i = 0; i < list.size()-1; i++) {
				tmpList.add(list.get(i+1) - list.get(i));
			}
			list.clear();
			for (Integer i : tmpList) {
				list.add(i);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i == list.size()-1) continue;
			sb.append(",");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
