package SWExpertAcademy.D3.EightThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TheatherSeat8500 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		ArrayList<Integer> list = new ArrayList<>();
		int T = Integer.parseInt(br.readLine()), N = 0, cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			list.clear();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			
			for (int j = 0; j < list.size(); j++) {
				cnt += list.get(j);
			}
			cnt += (list.get(list.size()-1) + N);
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
