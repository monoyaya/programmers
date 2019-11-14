package level2;

public class Top {
	public static void main(String[] args) {
		int[] heights = { 3, 9, 9, 3, 5, 7, 2 };

		int[] temp = new Top().solution(heights);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);

			if (i != temp.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		answer[0] = 0;

		for (int i = heights.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}

		return answer;
	}
}
