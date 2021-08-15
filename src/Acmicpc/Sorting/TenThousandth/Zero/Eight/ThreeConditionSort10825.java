package Acmicpc.Sorting.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Std {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public Std(String n, int k, int e, int m) {
		this.name = n;
		this.kor = k;
		this.eng = e;
		this.mat = m;
	}
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMat() {
		return this.mat;
	}
}
public class ThreeConditionSort10825 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Std[] stds = new Std[N];
		
		for (int i = 0, kor = 0, eng = 0, mat = 0; i < stds.length; i++) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			kor = Integer.parseInt(st.nextToken());
			eng = Integer.parseInt(st.nextToken());
			mat = Integer.parseInt(st.nextToken());
			stds[i] = new Std(name, kor, eng, mat);
		}
		
		Arrays.sort(stds, new Comparator<Std>() {
			@Override
			public int compare(Std o1, Std o2) {
				if (o1.getKor() == o2.getKor() && o1.getEng() == o2.getEng() && o1.getMat() == o2.getMat()) {
					return o1.getName().compareTo(o2.getName());
				}
				else if (o1.getKor() == o2.getKor() && o1.getEng() == o2.getEng()) {
					return o2.getMat() - o1.getMat(); 
				}
				else if (o1.getKor() == o2.getKor()) {
					return o1.getEng() - o2.getEng();
				}
				else return o2.getKor() - o1.getKor();
			}
		});
		for (int i = 0; i < stds.length; i++) {
			sb.append(stds[i].getName() + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
