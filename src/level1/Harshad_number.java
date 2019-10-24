package level1;

public class Harshad_number {
	public static void main(String[] args) {
		int x = 13;

		Harshad_number harshad_number = new Harshad_number();

		System.out.println(harshad_number.solution2(x));
	}

	public boolean solution(int x) {
		boolean answer = true;

		if (x <= 10) {
			return true;
		}

		int temp = x;
		int sum = 0;
		while (temp > 0) {
			sum += (temp % 10);
			temp /= 10;
		}

		if (x % sum != 0) {
			answer = false;
		}

		return answer;
	}
	
	public boolean solution2(int x) {
		boolean answer = true;

		if (x <= 10) {
			return true;
		}

		int sum = String.valueOf(x).chars().map(i -> i-'0').sum();

		if (x % sum != 0) {
			answer = false;
		}

		return answer;
	}
}
