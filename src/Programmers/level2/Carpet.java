package Programmers.level2;

public class Carpet {
	static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown+yellow;
        int guessBrown = 0, guessYellow = 0;
        
        for (int i = area-1, j = 0; i > 0; i--) {
        	if (area % i != 0) continue;
        	j = area / i;
        	guessYellow = (i-2) * (j-2);
        	guessBrown = area - guessYellow;
        	
        	if (brown == guessBrown && yellow == guessYellow) {
        		answer[0] = j;
        		answer[1] = i;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int brown = 8, yellow = 1;
		
		int[] arr = solution(brown, yellow);
		
		System.out.println(arr[0] + ", " + arr[1]);
	}
}
