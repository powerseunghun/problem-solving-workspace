package Acmicpc.BruteForceAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Poly implements Comparable<Poly> {
	private int l;
	private int h;
	public Poly() {
		this.l = 0;
		this.h = 0;
	}
	public Poly(int x, int h) {
		this.l = x;
		this.h = h;
	}
	public int getL() {
		return this.l;
	}
	public int getH() {
		return this.h;
	}
	@Override
	public int compareTo(Poly o) {
		return this.getL() - o.getL();
	}
}
public class WarehousePolygon2304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		ArrayList<Poly> list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine()), maxH = 0, maxIdx = 0, sum = 0;
		int idx = 0;
		
		for (int i = 0, l = 0, h = 0; i < N; i++) {
			tmp = br.readLine();
			l = Integer.parseInt(tmp.split(" ")[0]);
			h = Integer.parseInt(tmp.split(" ")[1]);
			list.add(new Poly(l, h));
		}
		Collections.sort(list);
		for (int i = 0, l = 0, h = 0; i < list.size(); i++) {
			l = list.get(i).getL();
			h = list.get(i).getH();
			if (h > maxH) {
				maxH = h;
				maxIdx = i;
			}
		}
		sum = list.get(maxIdx).getH();
		idx = maxIdx;
		
		while (idx > 0) {
			Poly c = list.get(idx);
			Poly n = null;
			int lm = 0;
			for (int i = idx-1; i >= 0; i--) {
				if (list.get(i).getH() > lm) {
					lm = list.get(i).getH();
					idx = i;
					n = list.get(i);
				}
			}
			sum += (c.getL()-n.getL())*n.getH();
		}
		idx = maxIdx;
		while (idx < N-1) {
			Poly c = list.get(idx);
			Poly n = null;
			int rm = 0;
			for (int i = idx+1; i < N; i++) {
				if (list.get(i).getH() > rm) {
					rm = list.get(i).getH();
					idx = i;
					n = list.get(i);
				}
			}
			sum += (n.getL()-c.getL()) * n.getH();
		}
		
		System.out.println(sum);
	}
}
