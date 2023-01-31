package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class �����������ϱ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ������ �����Ͱ� �������� BufferedReader��
																					// ����ϴ°� ����
		int N = Integer.parseInt(br.readLine()); // N�� �ޱ�
		PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> { // �켱���� ť �����ϰ� ���Ѵ�.
			int first_abs = Math.abs(o1); // ù��° �����Ͱ� ũ�� ����� ����
			int second_abs = Math.abs(o2); // �ι�° �����Ͱ� ũ�� ������ ����
			// ������ ���� ��� ���� �켱
			if (first_abs == second_abs)
				return o1 > o2 ? 1 : -1; // ���� ù��° �ִ¾ְ� �ι�° ���� ũ�� 1�� �����ϰ� �ƴϸ� -1�� ����
			else
				// ������ ���� ������ �켱
				return first_abs - second_abs;
		});
		for (int i = 0; i < N; i++) {
			int request = Integer.parseInt(br.readLine());
			if (request == 0) {
				if (MyQueue.isEmpty()) { // MyQueue�� ����� ������ 0�� ��µȴ�.
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
