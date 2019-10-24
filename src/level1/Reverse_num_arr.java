package level1;

public class Reverse_num_arr {
	public static void main(String[] args) {
		long n = 12345;
		
		Reverse_num_arr arr = new Reverse_num_arr();
		
		int[] temp = arr.solution(n);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
			if (i == temp.length-1) {
				break;
			}
			System.out.print(", ");
		}
	}
	
	public int[] solution(long n) {
		int[] answer = {};
		
		int len = String.valueOf(n).length();
		answer = new int[len];
		
		for (int i = 0; i < len; i++) {
			answer[i] = (int)(n%10);
			n /= 10;
		}
		
		return answer;
	}
}
