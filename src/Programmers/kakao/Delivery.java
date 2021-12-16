package Programmers.kakao;

public class Delivery {
	static int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] time = new int[N][N];
        for (int i = 0, s = 0, e = 0; i < road.length; i++) {
        	s = road[i][0]-1;
        	e = road[i][1]-1;
        	time[s][e] = time[s][e] == 0 ? road[i][2] : Math.min(road[i][2], time[s][e]);
        	time[e][s] = time[e][s] == 0 ? road[i][2] : Math.min(road[i][2], time[e][s]);
        }
        for (int k = 0; k < N; k++) {
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < N; j++) {
        			if (i == j) continue;
        			if (time[i][k] != 0 && time[k][j] != 0) {
        				time[i][j] = time[i][j] == 0 ? time[i][k] + time[k][j] 
        						: Math.min(time[i][k]+time[k][j], time[i][j]);
					}
        		}
        	}
        }
        for (int el : time[0]) {
        	answer = el <= K ? answer + 1 : answer;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int N = 6, K = 4;
//		int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
		
		System.out.println(solution(N, road, K));
	}
}
