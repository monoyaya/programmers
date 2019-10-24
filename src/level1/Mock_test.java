package level1;

import java.util.ArrayList;

public class Mock_test {
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		
		Mock_test test = new Mock_test();
		
		int[] temp = test.solution(answers);
		
		for (int i : temp) {
			System.out.println(i + " ");
		}
	}

	public int[] solution(int[] answers) {
		int[] answer = new int[] { 0, 0, 0 };
		
		int[] player1 = { 1, 2, 3, 4, 5 };
		int[] player2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] player3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		int max = 0;
		
		ArrayList<Integer> countNum = new ArrayList<>();

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == player1[i % 5]) {
				answer[0]++;
			}
			if (answers[i] == player2[i % 8]) {
				answer[1]++;
			}
			if (answers[i] == player3[i % 10]) {
				answer[2]++;
			}
		}

		for (int n : answer) {
			if (n > max) {
				max = n;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (answer[i] == max) {
				countNum.add(i + 1);
			}
		}
		
		return countNum.stream().mapToInt(i -> i).toArray();
	}
}
