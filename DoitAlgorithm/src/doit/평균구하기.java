package doit;

import java.util.Scanner;

public class ��ձ��ϱ� {

	public static void main(String[] args) {
		// ���� �Է¹ޱ����� Scanner�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		// N���� �Է� �޴´�
		int N = sc.nextInt();
		// A�� �迭�� �����Ѵ�.
		int A[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); // A[i]�迭�ȿ� ������ ����
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i = 0; i < N; i++) {
			if(A[i] > max) max = A[i];
			sum = sum + A[i];
		}
		
		System.out.println(sum * 100.0 / max / N);
	}

}
