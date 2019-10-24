package level1;

import java.util.Calendar;
import java.util.Locale;

public class Year_2016 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		Year_2016 year_2016 = new Year_2016();
		
		System.out.println(year_2016.solution(a, b));
	}

	public String solution(int a, int b) {
		String answer = "";

		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, a - 1, b);

		answer = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.ENGLISH).toUpperCase();

		return answer;
	}
}
