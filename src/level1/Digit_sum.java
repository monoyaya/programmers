package level1;

public class Digit_sum {
	public static void main(String[] args) {
		int n = 123;
		
		System.out.println(new Digit_sum().solution(n));
	}
	
	public int solution(int n) {
		int answer = 0;

		String[] temp = String.valueOf(n).split("");
		
		for (int i = 0; i < temp.length; i++) {
			answer += Integer.parseInt(temp[i]);
		}
		
		return answer;
	}
}
