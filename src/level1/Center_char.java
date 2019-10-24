package level1;

public class Center_char {
	public static void main(String[] args) {
		String s = "abcde";

		Center_char center_char = new Center_char();

		System.out.println(center_char.solution(s));
	}

	public String solution(String s) {
		String answer = "";
		int len = s.length();

		int bI = len / 2;
		int lI = 0;

		if (len % 2 == 0) {
			lI = bI + 1;
			bI -= 1;
		} else {
			lI = bI + 1;
		}

		answer = s.substring(bI, lI);

		return answer;
	}
}
