package SWExpertAcademy.D3.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Summation8658 {
	static int func(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		ArrayList<Integer> list = new ArrayList<>();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			list.clear();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(func(Integer.parseInt(st.nextToken())));
			}
			Collections.sort(list);
			sb.append("#" + i + " " + list.get(list.size()-1) + " " + list.get(0) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
