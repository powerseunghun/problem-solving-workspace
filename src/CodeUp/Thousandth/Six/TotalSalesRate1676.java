package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalSalesRate1676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sales = new int[Integer.parseInt(br.readLine())];
		int[] ranks = new int[sales.length];
		int rank = 0;
		
		for (int i = 0; i < sales.length; i++) {
			sales[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < sales.length; i++) {
			rank = 1;
			for (int j = 0; j < sales.length; j++) {
				if (i == j) continue;
				if (sales[i] < sales[j]) rank++;
			}
			ranks[i] = rank;
		}
		
		for (int i = 0; i < ranks.length; i++) {
			System.out.println(ranks[i]);
		}
	}
}
