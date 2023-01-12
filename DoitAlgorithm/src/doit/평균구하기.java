package doit;

import java.util.Scanner;

public class 평균구하기 {

	public static void main(String[] args) {
		// 값을 입력받기위해 Scanner를 사용한다.
		Scanner sc = new Scanner(System.in);
		// N값을 입력 받는다
		int N = sc.nextInt();
		// A의 배열을 선언한다.
		int A[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); // A[i]배열안에 점수를 저장
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
