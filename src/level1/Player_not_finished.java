package level1;

import java.util.Arrays;

public class Player_not_finished {
	public static void main(String[] args) {
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };

		Player_not_finished finished = new Player_not_finished();

		System.out.println(finished.solution(participant, completion));
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		
		if (answer.equals("")) {
			answer = participant[participant.length-1];
		}
		
		return answer;
	}
}
