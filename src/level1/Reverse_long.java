package level1;

import java.util.ArrayList;
import java.util.Comparator;

public class Reverse_long {
	public static void main(String[] args) {
		long n = 118372;
		
		System.out.println(new Reverse_long().solution2(n));
	}
	
	public long solution(long n) {
		long answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (n>0) {
			list.add((int)(n%10));
			n/=10;
		}
		
		list.sort(Comparator.reverseOrder());
		
		String rt = "";
		for (Integer i : list) {
			rt += i;
		}
		
		answer = Long.parseLong(rt);
		
		return answer;
	}
	
	public long solution2(long n) {
		long answer = 0;
		
		int[] temp = String.valueOf(n)
							.chars()
							.map(i -> i-'0')
							.sorted()
							.toArray();
		
		StringBuilder sb = new StringBuilder();
		
		for (int j : temp) {
			sb.insert(0, j);
		}
		
		answer = Long.parseLong(sb.toString());
		
		return answer;
	}
}
