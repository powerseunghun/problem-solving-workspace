package Acmicpc.As.B3.ThirtyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Participation32969 {
	static List<String> list1 = new ArrayList<>(Arrays.asList("social", "history", "language", "literacy"));
	static List<String> list2 = new ArrayList<>(Arrays.asList("bigdata", "public", "society"));
	static String func(String str) {
		for (int i = 0; i < list1.size(); i++) {
			if (str.contains(list1.get(i))) {
				return "digital humanities";
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			if (str.contains(list2.get(i))) {
				return "public bigdata";
			}
		}
		return "";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str));
		br.close();
	}
}
