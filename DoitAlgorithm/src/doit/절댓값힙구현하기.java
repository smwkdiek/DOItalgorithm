package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 절댓값힙구현하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 들어오는 데이터가 많을때는 BufferedReader를
																					// 사용하는게 좋다
		int N = Integer.parseInt(br.readLine()); // N값 받기
		PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> { // 우선순위 큐 선언하고 비교한다.
			int first_abs = Math.abs(o1); // 첫번째 데이터가 크면 양수를 리턴
			int second_abs = Math.abs(o2); // 두번째 데이터가 크면 음수를 리턴
			// 절댓값이 같은 경우 음수 우선
			if (first_abs == second_abs)
				return o1 > o2 ? 1 : -1; // 만약 첫번째 있는애가 두번째 보다 크면 1을 리턴하고 아니면 -1을 리턴
			else
				// 절댓값이 작은 데이터 우선
				return first_abs - second_abs;
		});
		for (int i = 0; i < N; i++) {
			int request = Integer.parseInt(br.readLine());
			if (request == 0) {
				if (MyQueue.isEmpty()) { // MyQueue가 비워져 있으면 0이 출력된다.
					System.out.println("0");
				} else {
					System.out.println(MyQueue.poll());
				}
			} else {
				MyQueue.add(request);
			}
		}
	}
}
