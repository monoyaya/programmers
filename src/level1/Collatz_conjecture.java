package level1;

public class Collatz_conjecture {
	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(new Collatz_conjecture().solution(num));
	}
	
	public int solution(int num) {
		int answer = 0;
		
		long n = num;

		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			
			answer++;

			if (answer > 500) {
				return -1;
			}
		}

		return answer;
	}
}
