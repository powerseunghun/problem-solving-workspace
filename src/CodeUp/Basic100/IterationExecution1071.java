package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IterationExecution1071 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			System.out.println(n);
		}
	}
}
