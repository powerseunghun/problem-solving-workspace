package LettCode.Hundred.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Bus implements Comparable<Bus> {
	private int s;
	private int d;
	private int number;
	public Bus() {}
	public Bus(int s, int d, int n) {
		this.s = s;
		this.d = d;
		this.number = n;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int compareTo(Bus o) {
		return this.s - o.s;
	}
}
public class SoheeBus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Bus> q = new PriorityQueue<>();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int T = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0, s = 0, d = 0; i < N; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			q.add(new Bus(s, d, i+1));
		}
		
		while (!q.isEmpty()) {
			Bus bus = q.poll();
			if (bus.getS() >= T) {
				if (q.isEmpty()) {
					System.out.println(bus.getNumber());
				}
				else {
					while (!q.isEmpty()) {
						Bus compareBus = q.poll();
						if (compareBus.getS() == bus.getS() && compareBus.getNumber() < bus.getNumber()) {
							bus = compareBus;
						}
					}
					System.out.println(bus.getNumber());
				}
				return;
			}
			else {
				bus.setS(bus.getS() + bus.getD());
				q.add(bus);
			}
		}
	}
}
