package level1;

import java.util.ArrayList;

public class Hate_equal_num {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

		Hate_equal_num num = new Hate_equal_num();

		int[] temp = num.solution(arr);

		for (int i : temp) {
			System.out.println(i + " ");
		}
	}

	public int[] solution(int[] arr) {
		int[] answer = {};

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				continue;
			}
			list.add(arr[i]);
		}

		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
