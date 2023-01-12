package doit;

import java.util.Scanner;

public class 연속된자연수의합구하기 {

	public static void main(String[] args) {
		// 값을 입력받기위해 Scanner를 사용함
		Scanner sc = new Scanner(System.in);
		// N값 데이터받기
		int N = sc.nextInt();
		// 변수를 초기화
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		// while문을 사용하고 end_index는 동등비교 != 를 사용하여 N값과 다른지 검사
		while(end_index!=N) {
			if(sum==N) {
				count++; // 1증가
				end_index++; // 1증가
				sum = sum  + end_index;	// sum 값을 변경
			} else if(sum > N) {
				sum = sum - start_index; // 값 변경
				start_index++; // 1증가
			} else {
				end_index++; //1증가
				sum = sum + end_index; // 값 변경
			}
		}
		System.out.println(count);
	}
}
