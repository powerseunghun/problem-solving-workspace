package Acmicpc.As.B2.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Grade17826 {
	static String get(int res) {
		if (res <= 5) {
			return "A+";
		}
		else if (res <= 15) {
			return "A0";
		}
		else if (res <= 30) {
			return "B+";
		}
		else if (res <= 35) {
			return "B0";
		}
		else if (res <= 45) {
			return "C+";
		}
		else if (res <= 48) {
			return "C0";
		}
		else return "F";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		int v = Integer.parseInt(br.readLine()), idx = 1;
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for (Integer i : list) {
			if (i == v) {
				break;
			}
			idx++;
		}
		
		System.out.println(get(idx));
		br.close();
	}
}
