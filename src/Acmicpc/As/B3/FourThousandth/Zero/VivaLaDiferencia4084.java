package Acmicpc.As.B3.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VivaLaDiferencia4084 {
	static long[] arr = new long[4];
	static void swap() {
		long a = arr[0], b = arr[1], c = arr[2], d = arr[3];
		arr[0] = Math.abs(a-b);
		arr[1] = Math.abs(b-c);
		arr[2] = Math.abs(c-d);
		arr[3] = Math.abs(d-a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int count = 0;
		
		while (true) {
			tmp = br.readLine();
			count = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Long.parseLong(tmp.split(" ")[i]);
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
			
			while (!(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3])) {
				count++;
				swap();
			}
			sb.append(count + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
