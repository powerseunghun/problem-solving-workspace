package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneDimensionArray1095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = 24, tmp = 0;
		
		while(st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			min = min > tmp ? tmp : min;
		}
		
		System.out.println(min);
	}
}
