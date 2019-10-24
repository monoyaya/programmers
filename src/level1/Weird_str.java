package level1;

public class Weird_str {
	public static void main(String[] args) {
		String s = "try hello world";
		
		System.out.println(new Weird_str().solution(s));
	}

	public String solution(String s) {
		String answer = "";

		char[] c = s.toCharArray();
		int f = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				f = 0;
				continue;
			}

			if (f % 2 == 0) {
				c[i] = Character.toUpperCase(c[i]);
			} else {
				c[i] = Character.toLowerCase(c[i]);
			}

			f++;
		}

		answer = String.valueOf(c);

		return answer;
	}
}
