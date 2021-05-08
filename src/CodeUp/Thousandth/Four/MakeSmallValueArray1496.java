package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeSmallValueArray1496 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine()) / 2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0, t1 = 0, t2 = 0; i < arr.length; i++) {
			t1 = Integer.parseInt(st.nextToken());
			t2 = Integer.parseInt(st.nextToken());
			arr[i] = t1 >= t2 ? t1 : t2;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
