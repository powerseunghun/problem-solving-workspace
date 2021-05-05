package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NumberRotation1405 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt = 0, idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			idx = i;
			while (cnt != n) {
				System.out.print(list.get(idx++ % n) + " ");
				cnt++;
			}
			System.out.println();
			cnt = 0;
		}
	}
}
