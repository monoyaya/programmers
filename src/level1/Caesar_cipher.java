package level1;

public class Caesar_cipher {
	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		
		Caesar_cipher cipher = new Caesar_cipher();
		
		System.out.println(cipher.solution(s, n));
	}

	public String solution(String s, int n) {
		String answer = "";

		char[] temp = s.toCharArray();

		for (int i = 0; i < temp.length; i++) {
			int rt = temp[i] + n;

			if (temp[i] != ' ' && temp[i] <= 'Z') {
				if (rt > 'Z') {
					temp[i] = (char) (rt - 'Z' + 'A' - 1);
				} else {
					temp[i] = (char) rt;
				}
			} else if (temp[i] != ' ' && temp[i] <= 'z') {
				if (rt > 'z') {
					temp[i] = (char) (rt - 'z' + 'a' - 1);
				} else {
					temp[i] = (char) rt;
				}
			}
		}

		answer = new String(temp);

		return answer;
	}
}
