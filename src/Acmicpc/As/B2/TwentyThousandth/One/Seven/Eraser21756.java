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
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		while(list.size() >= 2) {
			for (int i = 0; i < list.size(); i++) {
				list.remove(i);
			}
		}

		System.out.println(list.get(0));
		br.close();
	}
}
