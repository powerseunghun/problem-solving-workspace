package Acmicpc.As.B3.TwentyThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CancelTheTrains27475 {
	static List<Integer> list1 = null, list2 = null;
	static void assignList(String str, boolean flag) {
		for (int i = 0; i < str.split(" ").length; i++) {
			if (flag) {
				list1.add(Integer.parseInt(str.split(" ")[i]));
			} else {
				list2.add(Integer.parseInt(str.split(" ")[i]));
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, m = 0, res = 0;
		String str = null;
		
		while(t-- > 0) {
			str = br.readLine();
			list1 = new ArrayList<>();
			list2 = new ArrayList<>();
			
			str = br.readLine();
			assignList(str, true);
			str = br.readLine();
			assignList(str, false);
			
			res = 0;
			for (int i = 0; i < list1.size(); i++) {
				if (list2.contains(list1.get(i))) {
					res++;
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
