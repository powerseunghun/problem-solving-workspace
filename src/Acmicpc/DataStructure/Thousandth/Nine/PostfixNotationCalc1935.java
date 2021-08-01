package Acmicpc.DataStructure.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PostfixNotationCalc1935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<>();
		Stack<String> st = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		String pn = br.readLine();
		for (int i = 0; i < N; i++) {
			map.put((char)(65+i), Integer.parseInt(br.readLine()));
		}
		
		for (int i = 0; i < pn.length(); i++) {
			if (pn.charAt(i) >= 'A' && pn.charAt(i) <= 'Z') {
				st.push(pn.charAt(i)+"");
			}
			else {
				String tOper1 = st.pop();
				String tOper2 = st.pop();
				double oper1 = 0;
				double oper2 = 0;
				if (map.containsKey(tOper1.charAt(0))) {
					oper1 = map.get(tOper1.charAt(0));
				}
				else {
					oper1 = Double.parseDouble(tOper1);
				}
				if (map.containsKey(tOper2.charAt(0))) {
					oper2 = map.get(tOper2.charAt(0));
				}
				else {
					oper2 = Double.parseDouble(tOper2);
				}
				double total = 0;
				switch(pn.charAt(i)) {
				case '+':
					total = oper2 + oper1;
					break;
				case '-':
					total = oper2 - oper1;
					break;
				case '*':
					total = oper2 * oper1;
					break;
				case '/':
					total = (double)oper2 / oper1;
					break;
				}
				st.push(total+"");
			}
		}
		System.out.printf("%.2f", Double.parseDouble(st.pop()));
	}
}
