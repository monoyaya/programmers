package level1;

public class Str_basic {
	public static void main(String[] args) {
		String s = "a234";
		
		Str_basic basic = new Str_basic();
		System.out.println(basic.solution(s));
	}

	public boolean solution(String s) {
		boolean answer = false;

		if (s.length() == 4 || s.length() == 6) {
			answer = s.matches("^[0-9]*$");
		}

		return answer;
	}
}
