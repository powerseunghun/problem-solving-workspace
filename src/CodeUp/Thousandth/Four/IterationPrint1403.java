package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IterationPrint1403 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
		}
	}
}
