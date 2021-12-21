package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class VisitPathLength {
	static Map<Character, int[]> posMap = new HashMap<>();
	static Map<String, Integer> check = new HashMap<>();
	static void posMapInit() {
		posMap.put('U', new int[] {0, 1});
		posMap.put('D', new int[] {0, -1});
		posMap.put('R', new int[] {1, 0});
		posMap.put('L', new int[] {-1, 0});
	}
	static boolean validCheck(int nx, int ny) {
		if (nx < -5 || ny < -5 || nx > 5 || ny > 5) return false;
		return true;
	}
	static int solution(String dirs) {
        int answer = 0, curX = 0, curY = 0;
        String visitPath1 = null, visitPath2 = null;
        posMapInit();
        
        for (int i = 0, nx = 0, ny = 0; i < dirs.length(); i++) {
        	nx = curX + posMap.get(dirs.charAt(i))[0];
        	ny = curY + posMap.get(dirs.charAt(i))[1];
        	
        	if (validCheck(nx, ny)) {
        		visitPath1 = nx+""+ny+dirs.charAt(i);
        		visitPath2 = curX+""+curY;
        		
        		switch(dirs.charAt(i)) {
        		case 'U':
        			visitPath2 += 'D';
        			break;
        		case 'D':
        			visitPath2 += 'U';
        			break;
        		case 'R':
        			visitPath2 += 'L';
    				break;
        		case 'L':
        			visitPath2 += 'R';
        			break;
        		}
        		if (!check.containsKey(visitPath1)) {
        			check.put(visitPath1, 1);
        			check.put(visitPath2, 1);
        			answer++;
        		}
        		curX = nx;
        		curY = ny;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		System.out.println(solution(dirs));
	}
}
