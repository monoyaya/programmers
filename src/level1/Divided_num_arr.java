package level1;

import java.util.Arrays;

public class Divided_num_arr {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		
		Divided_num_arr num_arr = new Divided_num_arr();
		
		int[] temp = num_arr.solution(arr, divisor);
		
		for (int i : temp) {
			System.out.println(i + " ");
		}
	}

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		arr = Arrays.stream(arr).filter(el -> el % divisor == 0).toArray();
		
		if (arr.length < 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = arr;
			Arrays.sort(answer);
		}

		return answer;
	}
}
