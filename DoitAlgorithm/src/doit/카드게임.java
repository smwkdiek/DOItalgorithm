package doit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ī����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>(); // Queue�� ����
		int N = sc.nextInt();
		for(int i = 1; i <=N; i++) {	// ť�� ī�� ����
			myQueue.add(i);
		}
		while(myQueue.size() > 1) {	// ī�尡 1�� ���� ������ �ݺ��Ѵ�.
			myQueue.poll();	// �� ���� ī�带 ����
			myQueue.add(myQueue.poll());	// �� ���� ī�带 ���� �Ʒ��� ī�� ������ �̵�
		}
		System.out.println(myQueue.poll());	// ���� ī�� ���
 	}
}
