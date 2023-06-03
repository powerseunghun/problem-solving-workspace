package Acmicpc.As.B2.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassFieldTrip27386 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Character> list = new ArrayList<>();
		String str = null;
		
		for (int i = 0; i < 2; i++) {
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				list.add(str.charAt(j));
			}
		}
		Collections.sort(list);
		
		for (char c : list) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
