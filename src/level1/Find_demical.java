package level1;

public class Find_demical {
	public static void main(String[] args) {
		int n = 2;

		Find_demical demical = new Find_demical();
		System.out.println(demical.solution(n));
	}

	public int solution(int n) {
		int answer = n - 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					answer--;
					break;
				}
			}
		}

		return answer;
	}
}
