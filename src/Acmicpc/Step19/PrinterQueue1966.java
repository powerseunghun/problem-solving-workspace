package Acmicpc.Step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Docu {
	private int order;
	private int important;
	Docu() {
		this.order = 0;
		this.important = 0;
	}
	Docu(int o, int i) {
		this.order = o;
		this.important = i;
	}
	public int getOrder() {
		return this.order;
	}
	public void setOrder(int o) {
		this.order = o;
	}
	public int getImportant() {
		return this.important;
	}
	public void setImportant(int i) {
		this.important = i;
	}
}
public class PrinterQueue1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, count = 0;
		boolean flag = true;
		LinkedList<Docu> q = new LinkedList<>();
		StringTokenizer st = null;
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			st = new StringTokenizer(br.readLine());
			q.clear();
			for (int j = 0; j < N; j++) {
				q.add(new Docu(j, Integer.parseInt(st.nextToken())));
			}
			
			count = 0;
			while (!q.isEmpty()) {
				flag = true;
				Docu tDocu = q.peek();
				for (int j = 1; j < q.size(); j++) {
					if (q.get(j).getImportant() > tDocu.getImportant()) {
						flag = false;
						break;
					}
				}
				tDocu = q.poll();
				if (flag) {
					count++;
					if (tDocu.getOrder() == M) {
						System.out.println(count);
						break;
					}
				}
				else q.addLast(tDocu);
			}
		}
	}
}
