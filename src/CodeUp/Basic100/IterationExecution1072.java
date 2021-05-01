package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IterationExecution1072 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
