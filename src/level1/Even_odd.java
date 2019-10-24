package level1;

public class Even_odd {
	public static void main(String[] args) {
		int num = 3;
		
		System.out.println(new Even_odd().solution(num));
	}

	public String solution(int num) {
		String answer = "";

		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}

		return answer;
	}
}
