package Acmicpc.Sorting.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Number implements Comparable<Number>{
	private int number;
	private String str;
	public Number(int n, String s) {
		this.number = n;
		this.str = s;
	}
	public int getNumber() {
		return this.number;
	}
	public String getStr() {
		return this.str;
	}
	@Override
	public int compareTo(Number o) {
		return this.getStr().compareTo(o.getStr());
	}
}
public class NumberGame1755 {
	static ArrayList<String> list = new ArrayList<>();
	static Map<Integer, String> map = new HashMap<>();
	static void mapInit() {
		String[] s = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < 10; i++) {
			map.put(i, s[i]);
		}
	}
	static String getString(int n) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> t = new ArrayList<>();
		while (n != 0) {
			t.add(map.get(n%10));
			n /= 10;
		}
		for (int i = t.size()-1; i >= 0; i--) {
			sb.append(t.get(i) + " ");
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine(), str = null;
		mapInit();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]), idx = 0;
		Number[] ns = new Number[N-M+1];
		
		for (int i = M; i <= N; i++) {
			str = getString(i);
			ns[idx++] = new Number(i, str);
		}
		Arrays.sort(ns);
		
		for (int i = 0; i < ns.length; i++) {
			if (i != 0 && i % 10 == 0) System.out.println();
			System.out.print(ns[i].getNumber() + " ");
		}
	}
}
