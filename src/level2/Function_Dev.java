package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Function_Dev {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55, 92 };
		int[] speeds = { 1, 30, 5, 1 };

		int[] temp = new Function_Dev().solution(progresses, speeds);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
			if (i < temp.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};

		int nextIndex = 0;
		int cnt = 1;
		int[] day = new int[progresses.length];

		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			for (int j = 1; j <= 100; j++) {
				if (progresses[i] + j * speeds[i] > 100) {
					day[i] = j;
					break;
				}
			}
		}
		
		for (int i = 1; i < day.length; i++) {
			if (day[nextIndex] >= day[i]) {
				cnt++;
			} else {
				temp.add(cnt);
				cnt = 1;
				nextIndex = i;
			}
		}
		
		temp.add(cnt);

		for (Integer integer : temp) {
			System.out.println("list = " + integer);
		}

		answer = Arrays.stream(temp.toArray()).mapToInt(o -> Integer.parseInt(o.toString())).toArray();

		return answer;
	}
}
