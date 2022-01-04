package Programmers.kakao;

public class PassSteppingStone {
	static boolean check(int[] stones, int k, int mid) {
		int count = 0;
		for (int i = 0; i < stones.length; i++) {
			if (stones[i] - mid < 0) {
				count++;
				if (count == k) return false;
			}
			else count = 0;
		}
		return true;
		
	}
	static int solution(int[] stones, int k) {
        int answer = 0, low = 0, high = 200000000, mid = 0;
        
        while (low <= high) {
        	mid = (low + high) / 2;
        	if (check(stones, k, mid)) {
        		answer = Math.max(answer, mid);
        		low = mid+1;
        	}
        	else high = mid-1;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int k = 3;
		int[] stones = {2,4,5,3,2,1,4,2,5,1};
		
		System.out.println(solution(stones, k));
	}
}
