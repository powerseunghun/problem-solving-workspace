package Acmicpc.Sorting.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Bs implements Comparable<Bs>{
	private int num;
	private int idx;
	public Bs(int n, int i) {
		this.num = n;
		this.idx = i;
	}
	public int getNum() {
		return this.num;
	}
	public int getIdx() {
		return this.idx;
	}
	@Override
	public int compareTo(Bs o) {
		return this.num-o.getNum();
	}
}
public class BubbleSort1377 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		Bs[] arr = new Bs[N];
		
		for (int i = 0, val = 0; i < arr.length; i++) {
			val = Integer.parseInt(br.readLine());
			arr[i] = new Bs(val, i);
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i].getIdx()-i);
		}
		
		System.out.println(max+1);
	}
}
