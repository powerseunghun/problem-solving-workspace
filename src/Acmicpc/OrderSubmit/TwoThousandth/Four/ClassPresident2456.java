package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ClassPresident2456 {
	static class Info implements Comparable<Info> {
		private int p1;
		private int p2;
		private int p3;
		private int total;
		private int n;
		
		public int getP1() {
			return p1;
		}
		public void setP1(int p1) {
			this.p1 = p1;
		}
		public int getP2() {
			return p2;
		}
		public void setP2(int p2) {
			this.p2 = p2;
		}
		public int getP3() {
			return p3;
		}
		public void setP3(int p3) {
			this.p3 = p3;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}
		@Override
		public int compareTo(Info o) {
			if (this.getTotal() == o.getTotal()) {
				if (this.getP1() == o.getP1()) {
					if (this.getP2() == o.getP2()) {
						if (this.getP3() == o.getP3()) {
							return this.getN() - o.getN();
						}
						else return o.getP3()-this.getP3();
					}
					else return o.getP2()-this.getP2();
				}
				else return o.getP1()-this.getP1();
			}
			else return o.getTotal() - this.getTotal();
		}
	}
	static boolean check() {
		for (int i = 0; i < 4; i++) {
			switch(i) {
			case 0:
				if (user[0].getP1() != user[1].getP1()) return true;
				break;
			case 1:
				if (user[0].getP2() != user[1].getP2()) return true;
				break;
			case 2:
				if (user[0].getP3() != user[1].getP3()) return true;
				break;
			case 3:
				if (user[0].getTotal() != user[1].getTotal()) return true;
				break;
			}
		}
		return false;
	}
	static Info[] user = new Info[3];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = null;
		for (int i = 0; i < user.length; i++) {
			user[i] = new Info();
			user[i].setN(i+1);
		}
		
		for (int i = 0, order = 0, val = 0; i < N; i++, order = 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				user[order].setTotal(user[order].getTotal()+val);
				switch(val) {
				case 1:
					user[order].setP3(user[order].getP3()+1);
					break;
				case 2:
					user[order].setP2(user[order].getP2()+1);
					break;
				case 3:
					user[order].setP1(user[order].getP1()+1);
					break;
				}
				order++;
			}
		}
		
		for (int i = 0, p1 = 0, p2 = 0, p3 = 0; i < user.length; i++) {
			p1 = user[i].getP1()*3;
			p2 = user[i].getP2()*2;
			p3 = user[i].getP3();
			user[i].setTotal(p1+p2+p3);
			max = Math.max(max, user[i].getTotal());
		}
		Arrays.sort(user);
		
		if (check()) {
			System.out.println(user[0].getN() + " " + user[0].getTotal());
			return;
		}
		
		System.out.println("0 " + user[0].getTotal());
		br.close();
	}
}
