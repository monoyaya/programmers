package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BridgePassTruck {
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(new BridgePassTruck().solution(bridge_length, weight, truck_weights));
	}

	class Truck {
		int weight, move;

		public Truck(int weight) {
			this.weight = weight;
		}
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		Queue<Truck> bridge = new LinkedList<>();
		int onWeight = 0;

		Queue<Integer> waitTruck = new LinkedList<>();
		Arrays.stream(truck_weights).forEach(e -> waitTruck.add(e));

		bridge.add(new Truck(waitTruck.poll()));

		do {
			for (Truck truck : bridge) {
				truck.move++;

				if (truck.move == bridge_length)
					onWeight -= truck.weight;
				else if (truck.move == 1)
					onWeight += truck.weight;
			}

			if (!waitTruck.isEmpty() && onWeight + waitTruck.peek() <= weight)
				bridge.add(new Truck(waitTruck.poll()));

			if (bridge.peek().move > bridge_length)
				bridge.poll();

			answer++;
		} while (!bridge.isEmpty());

		return answer;
	}
}
