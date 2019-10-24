package level1;

public class Between_num_sum {
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		Between_num_sum num_sum = new Between_num_sum();
		System.out.println(num_sum.solution(a, b));
	}

	public long solution(int a, int b) {
		long answer = 0;

		int hi = 0, lo = 0;

		if (a == b) {
			return a;
		} else if (a > b) {
			hi = a;
			lo = b;
		} else {
			hi = b;
			lo = a;
		}

		for (int i = lo; i <= hi; i++) {
			answer += i;
		}

		return answer;
	}
}
