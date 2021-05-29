package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Store {
	int number;
	int dist;
	int price;
	int dRank;
	int pRank;
	Store() {
		this.number = 0;
		this.dist = 0;
		this.price = 0;
		this.dRank = 0;
		this.pRank = 0;
	}
	Store(int n, int d, int p) {
		this.number = n;
		this.dist = d;
		this.price = p;
		this.dRank = 0;
		this.pRank = 0;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getdRank() {
		return dRank;
	}
	public void setdRank(int dRank) {
		this.dRank = dRank;
	}
	public int getpRank() {
		return pRank;
	}
	public void setpRank(int pRank) {
		this.pRank = pRank;
	}
	
	@Override
	public String toString() {
		return this.getNumber() + " " + this.getDist() + " " + this.getPrice();
	}
}
public class CoolSix3018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		Store[] stores = new Store[Integer.parseInt(br.readLine())];
		for (int i = 0; i < stores.length; i++) {
			tmp = br.readLine();
			stores[i] = new Store();
			stores[i].setNumber(Integer.parseInt(tmp.split(" ")[0]));
			stores[i].setDist(Integer.parseInt(tmp.split(" ")[1]));
			stores[i].setPrice(Integer.parseInt(tmp.split(" ")[2]));
		}
		
		for (int i = 0; i < stores.length; i++) {
			for (int j = 0; j < stores.length; j++) {
				if (i == j) continue;
				if (stores[i].dist > stores[j].dist) {
					stores[i].setdRank(stores[i].getdRank()+1);
				}
				if (stores[i].price > stores[j].price) {
					stores[i].setpRank(stores[i].getpRank()+1);
				}
			}
		}
		Arrays.sort(stores, new Comparator<Store>() {

			@Override
			public int compare(Store s1, Store s2) {
				int stores1 = s1.getdRank() + s1.getpRank();
				int stores2 = s2.getdRank() + s2.getpRank();
				if (stores1 > stores2) return 1;
				else if (stores1 == stores2) {
					if (s1.getDist() > s2.getDist()) return 1;
					else return -1;
				}
				else return -1;
			}
		});
		
		System.out.println(stores[0]);
	}
}
