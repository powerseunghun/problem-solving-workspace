package CodeUp.FourThousandth.Seven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Info {
	int country;
	int num;
	int score;
	
	public Info(int country, int num, int score) {
		this.country = country;
		this.num = num;
		this.score = score;
	}
	public Info(Info i) {
		this.country = i.country;
		this.num = i.num;
		this.score = i.score;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
public class AsiaInfoOlympiad4751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		List<Info> list = new ArrayList<>();
		Map<Integer, Integer> counterList = new HashMap<>();
		for (int i = 0; i < n; i++) {
			list.add(new Info(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		
		for (int i = 0; i < list.size(); i++) {
			Info tmp = null;
			for (int j = 0; j < list.size() - (i + 1); j++) {
				if (list.get(j).getScore() < list.get(j + 1).getScore()) {
					tmp = new Info(list.get(j));
					list.get(j).setCountry(list.get(j + 1).getCountry());
					list.get(j).setNum(list.get(j + 1).getNum());
					list.get(j).setScore(list.get(j + 1).getScore());
					list.get(j + 1).setCountry(tmp.getCountry());
					list.get(j + 1).setNum(tmp.getNum());
					list.get(j + 1).setScore(tmp.getScore());
				}
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			int key = list.get(i).getCountry();
			if (!counterList.containsKey(key)) {
				counterList.put(key, 1);
				System.out.println(list.get(i).getCountry() + " " + list.get(i).getNum());
				count++;
			}
			else {
				if (counterList.get(key) == 2) continue;
				else {
					counterList.put(key, counterList.get(key) + 1);
					System.out.println(list.get(i).getCountry() + " " + list.get(i).getNum());
					count++;
				}
			}
			if (count == 3) break;
		}
	}
}
