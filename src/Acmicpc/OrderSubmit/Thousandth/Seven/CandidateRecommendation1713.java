package Acmicpc.OrderSubmit.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Candidate implements Comparable<Candidate> {
	private int number;
	private int time;
	private int recCount;
	
	public Candidate(int n, int t, int rc) {
		this.number = n;
		this.time = t;
		this.recCount = rc;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int n) {
		this.number = n;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRecCount() {
		return recCount;
	}
	public void setRecCount(int recCount) {
		this.recCount = recCount;
	}
	@Override
	public int compareTo(Candidate o) {
		if (this.getRecCount() == o.getRecCount()) {
			return this.getTime() - o.getTime();
		}
		else return this.getRecCount() - o.getRecCount();
	}
}
public class CandidateRecommendation1713 {
	static Map<Integer, Integer> check = new HashMap<>();
	static List<Candidate> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), c = 0, time = 0;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			time++;
			c = Integer.parseInt(st.nextToken());
			if (check.containsKey(c)) {
				for (int i = 0, tmp = 0; i < list.size(); i++) {
					if (list.get(i).getNumber() == c) {
						tmp = list.get(i).getRecCount();
						list.get(i).setRecCount(tmp+1);
						break;
					}
				}
			}
			else {
				if (list.size() >= N) {
					Collections.sort(list);
					check.remove(list.get(0).getNumber());
					list.remove(0);
				}
				list.add(new Candidate(c, time, 1));
				check.put(c, 1);
			}
		}
		List<Integer> pList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			pList.add(list.get(i).getNumber());
		}
		Collections.sort(pList);
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(pList.get(i) + " ");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
