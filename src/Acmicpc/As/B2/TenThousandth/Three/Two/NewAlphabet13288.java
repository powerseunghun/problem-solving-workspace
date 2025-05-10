package Acmicpc.As.B2.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewAlphabet13288 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		Map<Character, String> map = Stream.of(new Object[][] {
			{'a', "@"}, {'b', "8"}, {'c', "("}, {'d', "|)"}, {'e', "3"}, {'f', "#"}, {'g', "6"}, {'h', "[-]"}, {'i', "|"}, {'j', "_|"},
			{'k', "|<"}, {'l', "1"}, {'m', "[]\\/[]"}, {'n', "[]\\[]"}, {'o', "0"}, {'p', "|D"}, {'q', "(,)"}, {'r', "|Z"}, {'s', "$"},
			{'t', "']['"}, {'u', "|_|"}, {'v', "\\/"}, {'w', "\\/\\/"}, {'x', "}{"}, {'y', "`/"}, {'z', "2"}
		}).collect(Collectors.toMap(item -> (Character)item[0], item -> (String)item[1]));
		
		String str = br.readLine().toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				sb.append(map.get(c));
			} else {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
