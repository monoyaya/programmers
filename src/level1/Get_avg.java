package level1;

import java.util.Arrays;

public class Get_avg {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		System.out.println(new Get_avg().solution(arr));
	}

	public double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}
}
