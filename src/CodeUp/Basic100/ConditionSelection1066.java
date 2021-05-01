package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionSelection1066 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tk = 0;
		
		while(st.hasMoreTokens()) {
			tk = Integer.parseInt(st.nextToken());
			if (tk % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		
	}
}
