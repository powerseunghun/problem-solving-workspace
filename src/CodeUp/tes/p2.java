package CodeUp.tes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p2 {
	static int n = 10;
	static int lastTidx = 0;
	static int[] teamUp = null;
	static Map<Integer, Integer> idxCheck = new HashMap<>();
	static Map<Integer, Integer> score = new HashMap<>();
	static Map<Integer, ArrayList<Integer>> team = new HashMap<>();
	static int getStudentNum(int t) {
		ArrayList<Integer> list = team.get(t);
		int minNum = 10001;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) <= minNum) {
				minNum = list.get(i);
			}
		}
		return minNum;
	}
	static void teamSetting() {
		int[] v1 = {8, 4, 4, 1};
		int[] v2 = {1, 10, 9, 4};
		
		teamUp = new int[10001];
		Arrays.fill(teamUp, 0);
		
		for (int i = 0; i < v1.length; i++) {
			if (!idxCheck.containsKey(v1[i]) && !idxCheck.containsKey(v2[i])) {
				idxCheck.put(v1[i], i);
				idxCheck.put(v2[i], i);
				
				System.out.println("indxe : " + i);
				System.out.println("둘다 없음 : " + v1[i] + ", " + v2[i]);
				ArrayList<Integer> tmpTeam = new ArrayList<>();
				tmpTeam.add(v1[i]);
				tmpTeam.add(v2[i]);
				teamUp[i] = 1;
				lastTidx = i;
				team.put(i, tmpTeam);
				if (!score.containsKey(i)) {
					score.put(i, 0);
				}
				for (int j = 0; j < teamUp.length; j++) {
					System.out.print(teamUp[j] + " ");
				}
				System.out.println();
			}
			else if (idxCheck.containsKey(v1[i]) && !idxCheck.containsKey(v2[i])) {
				int tIdx = idxCheck.get(v1[i]);
				ArrayList<Integer> tmpTeam = team.get(tIdx);
				System.out.println("indxe : " + i);
				System.out.println("v1만 있음 : " + v1[i] + ", " + v2[i]);
				tmpTeam.add(v2[i]);
				team.put(tIdx, tmpTeam);
				if (!score.containsKey(tIdx)) {
					score.put(tIdx, 0);
				}
				for (int j = 0; j < teamUp.length; j++) {
					System.out.print(teamUp[j] + " ");
				}
				System.out.println();
			}
			else if (!idxCheck.containsKey(v1[i]) && idxCheck.containsKey(v2[i])) {
				int tIdx = idxCheck.get(v2[i]);
				ArrayList<Integer> tmpTeam = team.get(tIdx);
				System.out.println("indxe : " + i);
				System.out.println("v2만 있음 : " + v1[i] + ", " + v2[i]);
				tmpTeam.add(v1[i]);
				idxCheck.put(v1[i], tIdx);
				team.put(tIdx, tmpTeam);
				if (!score.containsKey(tIdx)) {
					score.put(i, 0);
				}
				for (int j = 0; j < teamUp.length; j++) {
					System.out.print(teamUp[j] + " ");
				}
				System.out.println();
			}
			else if (idxCheck.containsKey(v1[i]) && idxCheck.containsKey(v2[i])) {
				if (idxCheck.get(v1[i]) != idxCheck.get(v2[i])) {
					int tIdx1 = idxCheck.get(v1[i]);
					int tIdx2 = idxCheck.get(v2[i]);
					ArrayList<Integer> tmpTeam1 = team.get(tIdx1);
					ArrayList<Integer> tmpTeam2 = team.get(tIdx2);
					
					teamUp[tIdx1] = 0;
					teamUp[tIdx2] = 0;
					for (int j = 0; j < tmpTeam1.size(); j++) {
						idxCheck.replace(tmpTeam1.get(j), i);
					}
					for (int j = 0; j < tmpTeam2.size(); j++) {
						idxCheck.replace(tmpTeam2.get(j), i);
					}
 					teamUp[i] = 1;
					lastTidx = i;
					System.out.println("indxe : " + i);
					System.out.println("둘다 있음 합체 : " + v1[i] + ", " + v2[i]);
					for (int j = 0; j < tmpTeam2.size(); j++) {
						tmpTeam1.add(tmpTeam2.get(j));
					}
					
					team.put(i, tmpTeam1);
					if (!score.containsKey(i)) {
						score.put(i, 0);
					}
					for (int j = 0; j < teamUp.length; j++) {
						System.out.print(teamUp[j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
	static void scoreSetting() {
		int[] num = {2, 5, 8, 6, 4, 1, 3, 10, 7, 4};
		int[] amount = {3, -1, 3, 3, 1, -2, -4, 1, 2, -5};
		for (int i = 0; i < num.length; i++) {
			if (!idxCheck.containsKey(num[i])) {
				lastTidx += 1;
				idxCheck.put(num[i], lastTidx);
				ArrayList<Integer> newTeam = new ArrayList<>();
				newTeam.add(num[i]);
				team.put(lastTidx, newTeam);
				System.out.println("lastTidx : " + lastTidx);
				teamUp[lastTidx] = 1;
				score.put(lastTidx, amount[i]);
				System.out.println("포함 안 된 거 : " + num[i]);
			}
			else {
				ArrayList<Integer> t = team.get(idxCheck.get(num[i]));
				System.out.println(num[i] + "의 팀 : ");
				int s = score.get(idxCheck.get(num[i])) + amount[i];
//				maxScore = s >= maxScore ? s : maxScore;
				score.put(idxCheck.get(num[i]), s);
				for (int k = 0; k < t.size(); k++) {
					System.out.print(t.get(k) + " ");
				}
				System.out.println("의 점수 : " + score.get(idxCheck.get(num[i])));
				System.out.println();
			}
		}
		
		
	}
	public static void main(String[] args) {
		teamSetting();
//		for (int i = 0; i < teamUp.length; i++) {
//			if (teamUp[i] != 0) {
//				System.out.println(i);
//				ArrayList<Integer> t = team.get(i);
//				for (int j = 0; j < t.size(); j++) {
//					System.out.print(t.get(j) + " ");
//				}
//				System.out.println();
//			}
//		}
		scoreSetting();
		int maxScore = 0, tmpNum = 0, minNum = 10001;
		for (int i = 0; i < teamUp.length; i++) {
			if (teamUp[i] != 0) {
				int s = score.get(i);
				System.out.println(i + " : " + s);
				maxScore = s >= maxScore ? s : maxScore;
			}
		}
		for (int i = 0; i < teamUp.length; i++) {
			if (teamUp[i] != 0) {
				if (score.get(i) == maxScore) {
					tmpNum = getStudentNum(i);
					minNum = minNum >= tmpNum ? tmpNum : minNum;
				}
			}
		}
		System.out.println("대표 학생 : " + minNum);
		System.out.println("있는팀들");
		
		
		
	}
}
