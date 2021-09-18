package SWExpertAcademy.D3.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PerfectShuffle3499 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] tmp = null;
		StringTokenizer st = null;
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		int T = Integer.parseInt(br.readLine()), idx1 = 0, idx2 = 0;
		
		for (int i = 1; i <= T; i++) {
			list1.clear();
			list2.clear();
			idx1 = 0;
			idx2 = 0;
			sb.append("#" + i + " ");
			tmp = new String[Integer.parseInt(br.readLine())];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < tmp.length; j++) {
				tmp[j] = st.nextToken();
			}
			for (int j = 0; j < tmp.length; j++) {
				if (tmp.length % 2 == 0) {
					if (j < tmp.length/2) list1.add(tmp[j]);
					else list2.add(tmp[j]);
				}
				else {
					if (j <= tmp.length/2) list1.add(tmp[j]);
					else list2.add(tmp[j]);
				}
			}
			for (int j = 0; j < list1.size()+list2.size(); j++) {
				if (j % 2 == 0) sb.append(list1.get(idx1++) + " ");
				else sb.append(list2.get(idx2++) + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
