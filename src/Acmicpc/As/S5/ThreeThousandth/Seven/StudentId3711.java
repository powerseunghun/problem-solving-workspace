package Acmicpc.As.S5.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StudentId3711 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), G = 0, m = 0;
		Set<Integer> set = new HashSet<>();
		boolean flag = false;
		
		while(N-- > 0) {
			G = Integer.parseInt(br.readLine());
			arr = new int[G];
			for (int i = 0; i < G; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			m = 1;
			while(true) {
				flag = true;
				set.clear();
				for (int i = 0; i < arr.length; i++) {
					if (set.contains(arr[i]%m)) {
						flag = false;
						break;
					}
					set.add(arr[i]%m);
				}
				if (flag) {
					sb.append(m).append("\n");
					break;
				}
				m++;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
