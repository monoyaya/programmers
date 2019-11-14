package level2;

public class OneTwoFour {
	public static void main(String[] args) {
		int n = 3;

		System.out.println(new OneTwoFour().solution(n));
	}

	public String solution(int n) {
		String answer = "";

		StringBuilder sb = new StringBuilder();

		int round = n;
		int las = 0;

		while (round > 0) {
			las = round % 3;
			round /= 3;

			if (las == 0) {
				sb.insert(0, 4);
				round -= 1;
			} else {
				sb.insert(0, las);
			}
		}

		answer = sb.toString();

		return answer;
	}
}
