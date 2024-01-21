package Acmicpc.As.S5.TwentyThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MentoMenty26265 {
	static class A implements Comparable<A> {
		public String mento;
		public String menty;
		
		public A(String str) {
			this.mento = str.split(" ")[0];
			this.menty = str.split(" ")[1];
		}
		
		@Override
		public String toString() {
			return this.mento + " " + this.menty;
		}
		
		@Override
		public int compareTo(A o) {
			if (this.mento.equals(o.mento)) {
				return (this.menty.compareTo(o.menty) * -1);
			}
			return this.mento.compareTo(o.mento);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		List<A> list = new ArrayList<A>();
		
		while(N-- > 0) {
			list.add(new A(br.readLine()));
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).toString()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
