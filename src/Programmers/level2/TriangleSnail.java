package Programmers.level2;

public class TriangleSnail {
	static int getGoal(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	static int[][] makeSnailArr(int n, int goal) {
		int[][] arr = new int[n][];
		int value = 1;
		int x = 0, y = 0, dir = 0;
		int limitX = n-1, limitY = n-1;
		int limitXY1 = 1, limitXY2 = 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}
		for (int i = 1; i <= goal; i++) {
			arr[x][y] = value++;
			switch(dir) {
			case 0:
				x++;
				if (x > limitX) {
					dir = 1;
					x--;
					y++;
					limitX--;
				}
				break;
			case 1:
				y++;
				if (y > limitY) {
					dir = 2;
					y-=2;
					x--;
					limitY-=2;
				}
				break;
			case 2:
				x--;
				y--;
				if (x < limitXY1 && y < limitXY2) {
					dir = 0;
					x+= 2;
					y++;
					limitXY1 += 2;
					limitXY2 += 1;
				}
				break;
			}
		}
		return arr;
	}
	static int[] solution(int n, int goal) {
		int[][] arr = makeSnailArr(n, goal);
        int[] answer = new int[goal];
        
        for (int i = 0, idx = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr[i].length; j++) {
        		answer[idx++] = arr[i][j];
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int n = 4, goal = getGoal(n);
		int[] res = solution(n, goal);
		
		for (int el : res) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
}
