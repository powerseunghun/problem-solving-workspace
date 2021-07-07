package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardReBatch4941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[21], tmpArr = new int[21];
		int a = 0, b = 0, idx = 0;
		String tmp = null;
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 0; i < 10; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			idx = b;
			for (int j = 0; j < arr.length; j++) {
				if (j >= a && j <= b) {
					tmpArr[j] = arr[idx--];
				}
				else tmpArr[j] = arr[j];
			}
			for (int j = 0; j < arr.length; j++) {
				arr[j] = tmpArr[j];
			}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
