package level1;

import java.util.ArrayList;

public class Number_K {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3, }, { 4, 4, 1 }, { 1, 7, 3 } };

		Number_K k = new Number_K();

		int[] temp = k.solution(array, commands);

		for (int i : temp) {
			System.out.println(i + " ");
		}
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = new int[3];
			temp[0] = commands[i][0] - 1;
			temp[1] = commands[i][1] - 1;
			temp[2] = commands[i][2] - 1;

			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j < array.length; j++) {
				if (j >= temp[0] && j <= temp[1]) {
					list.add(array[j]);
				}
			}

			list.sort(null);
			answer[i] = list.get(temp[2]);
		}

		return answer;
	}
}
