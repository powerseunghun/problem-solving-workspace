package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GaussianSymbol2037 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int key = n;
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			if ((int) (key / n) > 1) break;
			else {
				list.add(key++);
			}
		}
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			}
			else {
				System.out.print(list.get(i) + ", ");
			}
		}
		System.out.print("}");
	}
}
