package level1;

public class GCD_LCM {
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		int[] temp = new GCD_LCM().solution(n, m);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
			if (i == temp.length-1) {
				break;
			}
			System.out.print(", ");
		}
	}

	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		if (n == m) {
			return new int[] { n, m };
		}

		int h = n, l = m;
		if (n < m) {
			h = m;
			l = n;
		}

		while (l > 0) {
			int x = h;
			h = l;
			l = x % l;
		}

		answer[0] = h;
		answer[1] = n * m / h;

		return answer;
	}
}
