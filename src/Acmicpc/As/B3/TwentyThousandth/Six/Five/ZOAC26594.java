package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ZOAC26594 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Character> list = new ArrayList<>();
		String str = br.readLine();
		char c = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (list.size() == 0) {
				list.add(c);
				continue;
			}
			if (list.get(list.size()-1) == c) continue;
			list.add(c);
		}
		
		System.out.println(str.length()/list.size());
		br.close();
	}
}
