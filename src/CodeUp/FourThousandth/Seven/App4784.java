package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class AppInfo {
	private int mem;
	private int cost;
	public AppInfo() {
		this.mem = 0;
		this.cost = 0;
	}
	public AppInfo(int m, int c) {
		this.mem = m;
		this.cost = c;
	}
	public void setMem(int m) {
		this.mem = m;
	}
	public int getMem() {
		return this.mem;
	}
	public void setCost(int c) {
		this.cost = c;
	}
	public int getCost() {
		return this.cost;
	}
}
public class App4784 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int sum = 0, reMem = 0;
		AppInfo[] apps = new AppInfo[n];
		
		for (int i = 0, mem = 0, cost = 0; i < apps.length; i++) {
			mem = Integer.parseInt(st1.nextToken());
			cost = Integer.parseInt(st2.nextToken());
			apps[i] = new AppInfo(mem, cost);
		}
		
		Arrays.sort(apps, new Comparator<AppInfo>() {

			@Override
			public int compare(AppInfo o1, AppInfo o2) {
				if (o1.getCost() == o2.getCost()) {
					if (o1.getMem() > o2.getMem()) {
						return 1;
					}
					else return -1;
				}
				return o1.getCost()-o2.getCost();
			}
		});
		for (int i = 0; i < apps.length; i++) {
			System.out.println(apps[i].getMem() + " " + apps[i].getCost());
		}
		for (int i = 0; i < apps.length; i++) {
			reMem += apps[i].getMem();
			sum += apps[i].getCost();
			System.out.println("reMem : " + reMem);
			System.out.println("sum : " + sum);
			if (reMem >= m) {
				break;
			}
		}
		System.out.println(sum);
	}
}
