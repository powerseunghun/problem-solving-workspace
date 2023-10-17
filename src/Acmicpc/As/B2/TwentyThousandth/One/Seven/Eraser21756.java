package Acmicpc.As.B2.TwentyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Eraser21756 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			list1.add(i);
		}
		
		while (list2.size() != 1) {
			list2.clear();
			for (int i = 1; i < list1.size(); i+=2) {
				list2.add(list1.get(i));
			}
			list1.clear();
			for (int i = 0; i < list2.size(); i++) {
				list1.add(list2.get(i));
			}
		}
		
		System.out.println(list2.get(0));
		br.close();
	}
}
