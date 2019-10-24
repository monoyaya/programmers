package level1;

import java.util.Comparator;

public class Str_desc {
	public static void main(String[] args) {
		String s = "Zbcdefg";

		Str_desc desc = new Str_desc();
		System.out.println(desc.solution(s));
	}

	public String solution(String s) {
		String answer = "";

		StringBuilder sb = new StringBuilder();

		s.chars()
			.filter(c -> Character.isLowerCase(c))
			.mapToObj(c -> (char) c)
			.sorted(Comparator.reverseOrder())
			.forEach(el -> sb.append(el));

		s.chars()
			.filter(c -> Character.isUpperCase(c))
			.mapToObj(c -> (char) c)
			.sorted(Comparator.reverseOrder())
			.forEach(el -> sb.append(el));

		answer = sb.toString();

		return answer;
	}
}
