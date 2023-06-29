package Acmicpc.As.B2.TwentyThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChairMan20124 {
	static class Wrapper implements Comparable<Wrapper>{
		public String n;
		public int v;
		
		public Wrapper(String n, int v) {
			this.n = n;
			this.v = v;
		}
		
		@Override
		public int compareTo(Wrapper o) {
			if (this.v == o.v) {
				return this.n.compareTo(o.n);
			}
			return o.v - this.v;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Wrapper[] arr = new Wrapper[N];
		String str = null;
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			arr[i] = new Wrapper(str.split(" ")[0], Integer.parseInt(str.split(" ")[1]));
		}
		Arrays.sort(arr);
		
		System.out.println(arr[0].n);
		br.close();
	}
}