package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Dragons {
	static class Dragon implements Comparable<Dragon>{
		private int power;
		private int bonusPower;
		
		public Dragon(int p, int bp) {
			this.power = p;
			this.bonusPower = bp;
		}
		public int getPower() {
			return power;
		}
		public void setPower(int power) {
			this.power = power;
		}
		public int getBonusPower() {
			return bonusPower;
		}
		public void setBonusPower(int bonusPower) {
			this.bonusPower = bonusPower;
		}
		@Override
		public int compareTo(Dragon o) {
			if (this.getPower() == o.getPower()) {
				return o.getBonusPower()-this.getBonusPower();
			}
			else return this.getPower()-o.getPower();
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Dragon[] dgs = null;
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int n = Integer.parseInt(tmp.split(" ")[1]);
		dgs = new Dragon[n];
		
		for (int i = 0, p = 0, bp = 0; i < n; i++) {
			tmp = br.readLine();
			p = Integer.parseInt(tmp.split(" ")[0]);
			bp = Integer.parseInt(tmp.split(" ")[1]);
			dgs[i] = new Dragon(p, bp);
		}
		Arrays.sort(dgs);
		
		for (int i = 0; i < dgs.length; i++) {
			if (s > dgs[i].getPower()) {
				s += dgs[i].getBonusPower();
				continue;
			}
			System.out.println("NO");
			return;
		}
		
		System.out.println("YES");
		br.close();
	}
}
