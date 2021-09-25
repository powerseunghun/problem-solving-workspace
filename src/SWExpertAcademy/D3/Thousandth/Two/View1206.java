package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class View1206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		ArrayList<Integer> list = new ArrayList<>();
		int max = 0, cnt = 0;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			cnt = 0;
			list.clear();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			for (int j = 2; j < list.size()-2; j++) {
				max = Math.max(list.get(j-2), Math.max(list.get(j-1), Math.max(list.get(j+1), list.get(j+2))));
				cnt = list.get(j) > max ? cnt += list.get(j)-max : cnt;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
