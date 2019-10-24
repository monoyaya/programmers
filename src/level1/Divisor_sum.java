package level1;

public class Divisor_sum {
	public static void main(String[] args) {
		int n = 0;
		
		System.out.println(new Divisor_sum().solution(n));
	}

	public int solution(int n) {
		int answer = n;

		if (n == 0) {
			return 0;
		}

		for (int i = 1; i <= n / 2 + 1; i++) {
			if (n % i == 0 && n != i) {
				answer += i;
			}
		}

		return answer;
	}
}
