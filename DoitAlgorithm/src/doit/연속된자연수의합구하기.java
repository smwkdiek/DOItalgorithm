package doit;

import java.util.Scanner;

public class ���ӵ��ڿ������ձ��ϱ� {

	public static void main(String[] args) {
		// ���� �Է¹ޱ����� Scanner�� �����
		Scanner sc = new Scanner(System.in);
		// N�� �����͹ޱ�
		int N = sc.nextInt();
		// ������ �ʱ�ȭ
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		// while���� ����ϰ� end_index�� ����� != �� ����Ͽ� N���� �ٸ��� �˻�
		while(end_index!=N) {
			if(sum==N) {
				count++; // 1����
				end_index++; // 1����
				sum = sum  + end_index;	// sum ���� ����
			} else if(sum > N) {
				sum = sum - start_index; // �� ����
				start_index++; // 1����
			} else {
				end_index++; //1����
				sum = sum + end_index; // �� ����
			}
		}
		System.out.println(count);
	}
}
