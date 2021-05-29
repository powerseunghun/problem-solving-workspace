package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
public class GradePrint3015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		List<Member> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			list.add(new Member(tmp.split(" ")[0], Integer.parseInt(tmp.split(" ")[1])));
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - (i + 1); j++) {
				Member tMember = null;
				if (list.get(j).score < list.get(j + 1).score) {
					tMember = new Member(list.get(j));
					list.get(j).name = list.get(j + 1).name;
					list.get(j).score = list.get(j + 1).score;
					list.get(j + 1).name = tMember.name;
					list.get(j + 1).score = tMember.score;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(list.get(i).name);
		}
	}
}
