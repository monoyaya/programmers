package level1;

import java.util.ArrayList;

public class Gym_suit {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };
		
		Gym_suit suit = new Gym_suit();
		
		System.out.println(suit.solution(n, lost, reserve));
	}

	public int solution(int n, int[] lost, int[] reserve) {
		if (n == lost.length) {
			return reserve.length;
		}

		ArrayList<Integer> stud = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			stud.add(1);
		}

		for (int i = 0; i < reserve.length; i++) {
			stud.set(reserve[i] - 1, 2);
		}

		for (int i = 0; i < lost.length; i++) {
			stud.set(lost[i] - 1, stud.get(lost[i] - 1) - 1);
		}

		for (int i = 1; i < stud.size(); i++) {
			if (stud.get(i - 1) == 0 && stud.get(i) == 2) {
				stud.set(i - 1, 1);
				stud.set(i, 1);
			}
		}

		for (int i = 0; i < stud.size() - 1; i++) {
			if (stud.get(i) == 2 && stud.get(i + 1) == 0) {
				stud.set(i, 1);
				stud.set(i + 1, 1);
			}
		}

		int count = 0;
		for (Integer integer : stud) {
			if (integer > 0) {
				count++;
			}
		}

		return count;
	}
}
