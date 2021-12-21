package Programmers.kakao;

public class MusicInfo {
	static String replaceSharp(String str) {
		String[] reg = {"C#", "D#", "F#", "G#", "A#"};
		String s = str;
		for (int i = 0; i < reg.length; i++) {
			s = s.replace(reg[i], (reg[i].charAt(0)+"").toLowerCase());
		}
		return s;
	}
	static String solution(String m, String[] musicinfos) {
        String answer = "", str = null;
        String startTime = null, endTime = null, music = null, playMusic = null;
        int time = 0, maxTime = Integer.MIN_VALUE;
        
        for (int i = 0; i < musicinfos.length; i++) {
        	str = musicinfos[i];
        	time = 0;
        	playMusic = "";
        	startTime = str.split(",")[0];
        	endTime = str.split(",")[1];
        	time += Integer.parseInt(endTime.split(":")[1]) - Integer.parseInt(startTime.split(":")[1]);
        	time += (Integer.parseInt(endTime.split(":")[0]) - Integer.parseInt(startTime.split(":")[0])) * 60;
        	if (time < 0) time += 1440;
        	
        	music = replaceSharp(str.split(",")[3]);
        	
        	for (int j = 0; j < time; j++) {
        		playMusic += music.charAt(j%music.length());
        	}
        	m = replaceSharp(m);
        	
        	if (playMusic.contains(m) && time > maxTime) {
        		answer = str.split(",")[2];
        		maxTime = time;
        	}
        }
        return answer.equals("") ? "(None)" : answer;
    }
	public static void main(String[] args) {
		String m = "ABC";
//		String[] musicinfos = {"13:35,14:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
//		String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
//		String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		String[] musicinfos = {"22:50,00:00,HELLO,ABCDEF", "13:00,13:05,WORLD,ABCDEF"};
		System.out.println(solution(m, musicinfos));
	}
}
