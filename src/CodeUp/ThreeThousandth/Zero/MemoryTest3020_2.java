package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Obj {
	int number;
	int order;
	public Obj() {
		this.number = 0;
		this.order = 0;
	}
	public Obj(int n, int o) {
		this.number = n;
		this.order = o;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
}
public class MemoryTest3020_2 {
	static int binarySearch(Obj[] objs, int target) {
		int l = 0, r = objs.length-1, mid = 0;
		while(l <= r) {
			mid = (l + r) / 2;
			if (objs[mid].getNumber() == target) {
				return objs[mid].getOrder();
			}
			else if (objs[mid].getNumber() < target) {
				l = mid+1;
			}
			else r = mid-1;
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Obj[] objs = new Obj[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < objs.length; i++) {
			objs[i] = new Obj();
			objs[i].setNumber(Integer.parseInt(st.nextToken()));
			objs[i].setOrder(i+1);
		}
		
		Arrays.sort(objs, new Comparator<Obj>() {
			@Override
			public int compare(Obj o1, Obj o2) {
				if (o1.getNumber() > o2.getNumber()) {
					return 1;
				}
				else return -1;
			}
		});
		br.readLine();
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			sb.append(binarySearch(objs, Integer.parseInt(st.nextToken())) + " ");
		}
		
		System.out.println(sb);
	}
}
