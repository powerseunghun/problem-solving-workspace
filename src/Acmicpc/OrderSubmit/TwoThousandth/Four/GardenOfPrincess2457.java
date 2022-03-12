package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Flower implements Comparable<Flower>{
	private int s;
	private int e;
	
	public Flower(int s, int e) {
		this.s = s;
		this.e = e;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	
	@Override
	public int compareTo(Flower o) {
		if (this.getS() == o.getS()) {
			return o.getE() - this.getE();
		}
		else return this.getS() - o.getS();
	}
}
public class GardenOfPrincess2457 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sd = 301, ed = 1201, idx = 0, max = 0, res = 0;
		Flower[] list = new Flower[N];
		StringTokenizer st = null;
		
		for (int i = 0, s = 0, e = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
			list[i] = new Flower(s, e);
		}
		Arrays.sort(list);
		while (sd < ed) {
			boolean flag = false;
			
			for (int i = idx; i < list.length; i++) {
				if (sd < list[i].getS()) break;
				if (list[i].getE() > max) {
					flag = true;
					max = list[i].getE();
					idx = i+1;
				}
			}
			if (flag) {
				sd = max;
				res++;
				continue;
			}
			break;
		}
		
		System.out.println(ed > max ? 0 : res);
		br.close();
	}
}
