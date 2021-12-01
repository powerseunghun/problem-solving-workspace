package Programmers.level3;

public class Network {
	static int count = 0;
	static boolean[] check = null;
	static void func(int v, int[][] computers) {
		check[v] = true;
		for (int i = 0; i < computers[v].length; i++) {
			if (i == v) continue;
			if (computers[v][i] != 0 && !check[i]) {
				func(i, computers);
			}
		}
	}
	static int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
        	if (!check[i]) {
        		func(i, computers);
        		answer++;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,1},{0,0,1}};
		
		System.out.println(solution(n, computers));
	}
}
