package Acmicpc.GreedyAlgorithm.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PPAP16120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'P':
				st.push(str.charAt(i));
				break;
			case 'A':
				//ppap condtion
				if (st.size() >= 2 && i < str.length()-1 && str.charAt(i+1) == 'P' ) {
					st.pop();
					st.pop();
				}
				else {
					System.out.println("NP");
					return;
				}
				break;
			}
		}
		if (st.size() == 1) System.out.println("PPAP");
		else System.out.println("NP");
		
	}
}
