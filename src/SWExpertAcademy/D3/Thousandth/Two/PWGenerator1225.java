package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PWGenerator1225 {
	static ArrayList<Integer> list = new ArrayList<>();
	static void func() {
		int w = -1, val = 0;
		while (true) {
			w = -1;
			for (int i = 0; i < 5; i++) {
				val = list.get(0);
				list.remove(0);
				list.add(val+w);
				if (list.get(list.size()-1) <= 0) {
					list.remove(list.size()-1);
					list.add(0);
					return;
				}
				w--;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			list.clear();
			sb.append("#" + i + " ");
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			func();
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(j) + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
