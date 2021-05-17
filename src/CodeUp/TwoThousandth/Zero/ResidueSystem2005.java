package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ResidueSystem2005 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), m;
		ArrayList<Integer> list = new ArrayList<>();
		boolean flag = true;
		
		String tmp = br.readLine();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(tmp.split(" ")[i]));
		}
		m = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int diff = Math.abs(list.get(i) - list.get(j));
				if (diff % m == 0) {
					flag = false;
					break;
				}
			}
		}
		if (flag) System.out.println("yes");
		else System.out.println("no");
	}
}
