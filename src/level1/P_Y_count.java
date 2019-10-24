package level1;

public class P_Y_count {
	public static void main(String[] args) {
		String s = "pPoooyY";

		P_Y_count count = new P_Y_count();
		System.out.println(count.solution(s));
	}

	boolean solution(String s) {
		boolean answer = true;

		int p = 0, y = 0;
		
		String[] temp = s.split("");
		for (int i = 0; i < temp.length; i++) {
			switch (temp[i]) {
			case "P":
			case "p":
				p++;
				break;
			case "Y":
			case "y":
				y++;
				break;
			}
		}

		if (p != y) {
			answer = false;
		}

		return answer;
	}
}
