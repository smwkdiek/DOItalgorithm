package doit;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// ���� �Է��ϱ����� ���
		Scanner sc = new Scanner(System.in);
		// N�� �Է�
		int N = sc.nextInt();
		// ���� N�� ���ڸ� �Է¹޾� String�� ���� sNum�� ����
		String sNum = sc.next();
		// sNum�� �ٽ� char[]�� ���� cNum�� ��ȯ�Ͽ� ����
		char[] cNum = sNum.toCharArray();
		// int�� ���� sum ���� �ʱ�ȭ �ϱ����� 0���� ���ش�.
		int sum = 0;
		
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0'; // cNum�ȿ� char���� ���������� �ƽ�Ű�ڵ带 ����Ͽ� cNum���ִ� ���ڿ��� ���������� �ٲ��ֱ����� "0"�̳� 48�� ����Ѵ�.
		}
		System.out.println(sum);
	}
}
