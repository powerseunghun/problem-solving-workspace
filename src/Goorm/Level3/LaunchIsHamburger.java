package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Hamburger implements Comparable<Hamburger>{
	private int eat;
	private int heat;
	public Hamburger() {
		this.eat = 0;
		this.heat = 0; 
	}
	public Hamburger(int eat, int heat) {
		super();
		this.eat = eat;
		this.heat = heat;
	}
	public int getEat() {
		return eat;
	}
	public void setEat(int eat) {
		this.eat = eat;
	}
	public int getHeat() {
		return heat;
	}
	public void setHeat(int heat) {
		this.heat = heat;
	}
	@Override
	public int compareTo(Hamburger o) {
		return this.heat - o.getHeat();
	}
}
public class LaunchIsHamburger {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), time = 0;
		String tmp = null;
		Hamburger[] hams = new Hamburger[N];
		
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			for (int j = 0; j < hams.length; j++) {
				if (hams[j] == null) hams[j] = new Hamburger();
				switch(i) {
				case 0:
					hams[j].setEat(Integer.parseInt(tmp.split(" ")[j]));
					break;
				case 1:
					hams[j].setHeat(Integer.parseInt(tmp.split(" ")[j]));
					time += hams[j].getHeat();
					break;
				}
			}
		}
		Arrays.sort(hams);
		
	}
}
