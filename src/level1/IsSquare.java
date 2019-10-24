package level1;

public class IsSquare {
	public static void main(String[] args) {
		long n = 1;

		System.out.println(new IsSquare().solution(n));
	}

	public long solution(long n) {
		long answer = 0;

		double num = Math.sqrt(n);

		int iNum = (int) num;

		if (num == iNum) {
			answer = (long) ((num + 1) * (num + 1));
		} else {
			answer = -1;
		}

		return answer;
	}
}
