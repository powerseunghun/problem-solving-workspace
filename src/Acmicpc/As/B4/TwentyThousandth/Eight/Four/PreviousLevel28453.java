package Acmicpc.As.B4.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreviousLevel28453 {
	static int func(int M) {
		if (M == 300) return 1;
		else if (M >= 275) return 2;
		else if (M >= 250) return 3;
		else return 4;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			sb.append(func(Integer.parseInt(st.nextToken())) + " ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
