package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Member {
	String name;
	int score;
	public Member() {
		this.name = "";
		this.score = 0;
	}
	public Member(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Member(Member m) {
		this.name = m.name;
		this.score = m.score;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
public class GradeCardPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		List<Member> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(new Member(sc.next(), sc.nextInt()));
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - (i + 1); j++) {
				Member tmp = null;
				if (list.get(j).score < list.get(j + 1).score) {
					tmp = new Member(list.get(j));
					list.get(j).name = list.get(j + 1).name;
					list.get(j).score = list.get(j + 1).score;
					list.get(j + 1).name = tmp.name;
					list.get(j + 1).score = tmp.score;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(list.get(i).name);
		}
	}
}
