package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeBigArrayGroup1499 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), g = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, max = 0; i < arr.length;) {
			max = arr[i];
			for (int j = 0; j < g; j++) {
				if (i + j > arr.length - 1) {
					break;
				}
				max = arr[i+j] >= max ? arr[i+j] : max;
			}
			System.out.print(max + " ");
			i += g;
		}
		
	}
}
