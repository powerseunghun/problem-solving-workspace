package Programmers.kakao;

public class PushKeypad {
	public double getDistance(int x1, int y1, int x2, int y2) {
		double dist = 0.0;
		dist = Math.abs(x2 - x1) + Math.abs(y2 - y1);
		return dist;
	}
	public String getXY(int n) {
		String str = "";
		switch(n) {
		case 1: str = "0,0"; break;
		case 2: str = "0,1"; break;
		case 3: str = "0,2"; break;
		case 4: str = "1,0"; break;
		case 5: str = "1,1"; break;
		case 6: str = "1,2"; break;
		case 7: str = "2,0"; break;
		case 8: str = "2,1"; break;
		case 9: str = "2,2"; break;
		case 42: str = "3,0"; break;
		case 0: str = "3,1"; break;
		case 35: str = "3,2"; break;
		}
		return str;
	}
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int cLeft = 42, cRight = 35;
        int lx = 0, ly = 0, rx = 0, ry = 0, px = 0, py = 0;
        double lDist = 0.0, rDist = 0.0;
        for (int i = 0; i < numbers.length; i++) {
        	switch(numbers[i]) {
        	case 1: case 4: case 7:
        		answer += "L";
        		cLeft = numbers[i];
        		break;
        	case 3: case 6: case 9:
        		answer += "R";
        		cRight = numbers[i];
        		break;
        	case 2: case 5: case 8: case 0:
        		lx = Integer.parseInt(this.getXY(cLeft).split(",")[0]);
        		ly = Integer.parseInt(this.getXY(cLeft).split(",")[1]);
        		rx = Integer.parseInt(this.getXY(cRight).split(",")[0]);
        		ry = Integer.parseInt(this.getXY(cRight).split(",")[1]);
        		px = Integer.parseInt(this.getXY(numbers[i]).split(",")[0]);
        		py = Integer.parseInt(this.getXY(numbers[i]).split(",")[1]);
        		lDist = this.getDistance(px, py, lx, ly);
        		rDist = this.getDistance(px, py, rx, ry);
        		
        		if (lDist == rDist) {
        			if (hand.equals("right")) {
        				answer += "R";
        				cRight = numbers[i];
        			}
        			else {
        				answer += "L";
        				cLeft = numbers[i];
        			}
        		}
        		else {
        			if (lDist > rDist) {
        				answer += "R";
        				cRight = numbers[i];
        			}
        			else {
        				answer += "L";
        				cLeft = numbers[i];
        			}
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		System.out.println(new PushKeypad().solution(numbers, hand));
	}
}
