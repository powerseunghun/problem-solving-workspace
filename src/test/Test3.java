package test;

public class Test3 {
	public static int[] solution(int[][] v) {
		int[] answer = new int[2];
		
		if (v[0][0] == v[1][0]) {
			answer[0] = v[2][0];
		}
		else {
			if (v[1][0] == v[2][0]) {
				answer[0] = v[0][0];
			}
			else {
				answer[0] = v[1][0];
			}
		}
		
		if (v[0][1] == v[1][1]) {
			answer[1] = v[2][1];
		}
		else {
			if (v[1][1] == v[2][1]) {
				answer[1] = v[0][1];
			}
			else {
				answer[1] = v[1][1];
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int[][] v = {
				{1, 1},
				{2, 2},
				{1, 2}
		};
		
		int[] s = solution(v);
		
		System.out.println(s[0] + " " + s[1]);
	}
}
