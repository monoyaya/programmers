package level1;

import java.util.ArrayList;

public class Str_arr_sort {
	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };
		int n = 1;
		
		Str_arr_sort arr_sort = new Str_arr_sort();
		
		String[] arr = arr_sort.solution(strings, n);
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public String[] solution(String[] strings, int n) {
		String[] answer = {};

		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < strings.length; i++) {
			strList.add(strings[i].charAt(n) + strings[i]);
		}
		
		strList.sort(null);

		answer = new String[strList.size()];

		for (int i = 0; i < strList.size(); i++) {
			answer[i] = strList.get(i).substring(1);
		}

		return answer;
	}
}
