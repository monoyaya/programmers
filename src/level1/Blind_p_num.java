package level1;

public class Blind_p_num {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		
		System.out.println(new Blind_p_num().solution(phone_number));
	}

	public String solution(String phone_number) {
		String answer = "";
		
		StringBuilder sb = new StringBuilder(phone_number);
		
		for (int i = 0; i < sb.length() - 4; i++) {
			sb.setCharAt(i, '*');
		}
		
		answer = sb.toString();
		
		return answer;
	}
}
