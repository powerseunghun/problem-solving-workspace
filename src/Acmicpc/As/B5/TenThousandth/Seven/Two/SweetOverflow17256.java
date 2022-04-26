package Acmicpc.As.B5.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SweetOverflow17256 {
	static StringBuilder sb = new StringBuilder();
	static class Cake {
		private int x;
		private int y;
		private int z;
		
		public Cake(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z = z;
		}
	}
	static void calc(Cake a, Cake c) {
		sb.append((c.getX()-a.getZ()) + " ");
		sb.append((c.getY()/a.getY()) + " ");
		sb.append((c.getZ()-a.getX()) + "\n");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Cake[] cakes = new Cake[2];
		String tmp = null;
		
		for (int i = 0, x = 0, y = 0, z = 0; i < cakes.length; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			z = Integer.parseInt(tmp.split(" ")[2]);
			cakes[i] = new Cake(x, y, z);
		}
		calc(cakes[0], cakes[1]);
		
		System.out.print(sb.toString());
		br.close();
	}
}
