package Acmicpc.Sorting.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DivideWord1251 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i < str.length()-1; i++) {
			for (int j = i+1; j < str.length(); j++) {
				sb = new StringBuilder();
				StringBuilder sb1 = new StringBuilder(str.substring(0, i));
				StringBuilder sb2 = new StringBuilder(str.substring(i, j));
				StringBuilder sb3 = new StringBuilder(str.substring(j, str.length()));
				sb.append(sb1.reverse().toString());
				sb.append(sb2.reverse().toString());
				sb.append(sb3.reverse().toString());
				list.add(sb.toString());
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
