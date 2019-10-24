package level1;

public class Str_to_int {
	public static void main(String[] args) {
		String s = "-1234";

		Str_to_int to_int = new Str_to_int();
		System.out.println(to_int.solution(s));
	}

	public int solution(String s) {
		int x = 1;
		
		if (s.startsWith("-")) {
			x = -1;
			s = s.substring(1);
		}
		
		return Integer.parseInt(s) * x;
	}
}
