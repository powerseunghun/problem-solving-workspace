package Acmicpc.As.S5.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A implements Comparable<A> {
	public int a;
	public int b;
	
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(A o) {
		if (this.a == o.a) return this.b - o.b;
		return o.a - this.a;
	}
}
public class StellaChicken15905 {
	static final int n = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		List<A> list = new ArrayList<>();
		String str = null;
		A base = null;
		
		while(N-- > 0) {
			str = br.readLine();
			list.add(new A(Integer.parseInt(str.split(" ")[0]), Integer.parseInt(str.split(" ")[1])));
		}
		Collections.sort(list);
		
		base = list.get(n-1);
		
		for (int i = n; i < list.size(); i++) {
			if (list.get(i).a == base.a) {
				res++;
				continue;
			}
			break;
		}
		
		System.out.println(res);
		br.close();
	}
}
