package Acmicpc.OrderSubmit.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Editor1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), tmp = null;
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		ArrayList<Character> list = new ArrayList<>();
		int M = Integer.parseInt(br.readLine());
		char cmd = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));
		}
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			cmd = tmp.split(" ")[0].charAt(0);
			switch(cmd) {
			case 'L':
				if (!st.isEmpty()) list.add(st.pop());
				break;
			case 'D':
				if (list.size() != 0) {
					st.push(list.get(list.size()-1));
					list.remove(list.size()-1);
				}
				break;
			case 'B':
				if (!st.isEmpty()) st.pop();
				break;
			case 'P':
				st.push(tmp.split(" ")[1].charAt(0));
				break;
			}
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		String tmpStr = sb.reverse().toString();
		sb = new StringBuilder(tmpStr);
		
		for (int i = list.size()-1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		System.out.println(sb.toString());
		br.close();
	}
}
