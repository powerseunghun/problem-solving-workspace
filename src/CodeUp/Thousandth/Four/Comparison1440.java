package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Comparison1440 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + ": ");
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				char c = ' ';
				if (arr[i] > arr[j]) c = '>';
				else if (arr[i] < arr[j]) c = '<';
				else c = '=';
				
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
