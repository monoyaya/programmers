package level1;

import java.util.stream.LongStream;

public class Step_x_num {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;

		long[] temp = new Step_x_num().solution(x, n);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
			if (i == temp.length - 1) {
				break;
			}
			System.out.print(", ");
		}
	}

	public long[] solution(int x, int n) {
		long[] answer = {};

		LongStream ls = LongStream.iterate((long) x, l -> l + x);
		answer = ls.limit(n).toArray();

		return answer;
	}
}
