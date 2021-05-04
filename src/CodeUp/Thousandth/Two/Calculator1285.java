package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Calculator1285 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<Character> op = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(tmp, "+|-|*|/|=");
		int res = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == '+' || tmp.charAt(i) == '-' || 
				tmp.charAt(i) == '*' || tmp.charAt(i) == '/') {
				op.add(tmp.charAt(i));
			}
		}
		res = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < op.size(); i++) {
			switch(op.get(i)) {
			case '+':
				res += Integer.parseInt(st.nextToken());
				break;
			case '-':
				res -= Integer.parseInt(st.nextToken());
				break;
			case '*':
				res *= Integer.parseInt(st.nextToken());
				break;
			case '/':
				res /= Integer.parseInt(st.nextToken());
				break;
			}
		}
		System.out.println(res);
	}
}
