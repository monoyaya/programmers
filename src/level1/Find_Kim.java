package level1;

public class Find_Kim {
	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };

		Find_Kim kim = new Find_Kim();
		System.out.println(kim.solution(seoul));
	}

	public String solution(String[] seoul) {
		String answer = "";
		int x = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				x = i;
			}
		}

		answer = "김서방은 " + x + "에 있다";
		return answer;
	}
}
