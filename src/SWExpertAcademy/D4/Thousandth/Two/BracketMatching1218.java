package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketMatching1218 {
	static void mapInit() {
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		map.put('>', '<');
	}
	static Map<Character, Character> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		Stack<Character> st = new Stack<>();
		mapInit();
		
		for (int i = 1; i <= 10; i++) {
			st.clear();
			br.readLine();
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				switch(str.charAt(j)) {
				case '(': case '{': case '[': case '<':
					st.push(str.charAt(j));
					break;
				default:
					if (st.peek() != map.get(str.charAt(j))) {
						j = str.length()+1;
						break;
					}
					else st.pop();
					break;
				}
			}
			if (st.size() == 0) sb.append("#" + i + " 1\n");
			else sb.append("#" + i + " 0\n");
		}
		System.out.print(sb.toString());
	}
}
