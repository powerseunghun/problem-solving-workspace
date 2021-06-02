package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastPerson3110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int count = 0;
		int[] arr = new int[N];
		int K = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int get = 0; count != arr.length-1; ) {
			if (arr[get] == 0) {
				get = (get + 1) % arr.length;
			}
			arr[get] = 0;
			for (int match = 0; match < K; ) {
				get = (get + 1) % arr.length;
				if (arr[get] > 0) match++;
			}
			count++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) System.out.println(arr[i]);
		}
	}
}
