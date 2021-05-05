package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReversePrint1402 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
}
