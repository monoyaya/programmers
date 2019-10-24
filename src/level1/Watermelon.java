package level1;

public class Watermelon {
	public static void main(String[] args) {
		int n = 3;
		
		Watermelon watermelon = new Watermelon();
		System.out.println(watermelon.solution(n));
	}

	public String solution(int n) {
		String answer = "";

		int sub = n % 2;

		for (int i = 0; i < n / 2; i++) {
			answer += "수박";
		}

		if (sub != 0) {
			answer += "수";
		}

		return answer;
	}
}
