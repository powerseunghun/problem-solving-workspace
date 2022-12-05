package Acmicpc.As.B2.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingCall1333 {
	static boolean[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		int D = Integer.parseInt(tmp.split(" ")[2]);
		int len = N*L+(N-1)*5, res = -1, w = 0;
		arr = new boolean[len];
		
		for (int i = 0; i < arr.length; i+=(L+5)) {
			for (int j = i; j < i+L; j++) {
				arr[j] = true;
			}
		}
		
		for (w = 0; w < arr.length; w+=D) {
			if (!arr[w]) {
				res = w;
				break;
			}
		}
		
		System.out.println(res == -1 ? w : res);
		br.close();
	}
}
