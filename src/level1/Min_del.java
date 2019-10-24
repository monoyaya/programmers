package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Min_del {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };

		int[] temp = new Min_del().solution2(arr);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);

			if (i == temp.length - 1) {
				break;
			}

			System.out.print(", ");
		}
	}

	public int[] solution(int[] arr) {
		int[] answer = {};

		int len = arr.length;
		if (len == 1) {
			return new int[] { -1 };
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
			list.add(arr[i]);
		}

		list.remove(minIndex);

		answer = new int[len - 1];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public int[] solution2(int[] arr) {
		int[] answer = {};

		int min = Arrays.stream(arr).min().getAsInt();

		answer = Arrays.stream(arr).filter(i -> i != min).toArray();

		return answer;
	}
}
