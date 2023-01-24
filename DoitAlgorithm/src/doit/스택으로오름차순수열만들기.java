package doit;

import java.util.Scanner;
import java.util.Stack;

public class �������ο���������������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ������ ���� �ޱ�
		int N = sc.nextInt();
		// ������ ������ŭ �迭 ä���
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer(); // ���� �����ϱ����� ���
		int num = 1; // ���������ϱ����� ���
		boolean result = true;
		for (int i = 0; i < A.length; i++) {
			int su = A[i]; // ������ �ִ°����� ���ʴ�� ������
			if (su >= num) { // ���� �������� �ڿ������� Ŭ ���
				while (su >= num) { // ���� ������������ �ݺ�
					stack.push(num++); // push�Ҷ����� num���� 1�� ����
					bf.append("+\n"); // +��°� ���ÿ� �ٹٲ� ����
				}
				stack.pop();
				bf.append("-\n"); // stack.pop()������Ҷ����� -�� ���
			} else {
				int n = stack.pop();

				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if (result)
			System.out.println(bf.toString());
	}
}
