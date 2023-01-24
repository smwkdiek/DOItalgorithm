package doit;

import java.util.Scanner;
import java.util.Stack;

public class 스택으로오름차순수열만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 수열의 갯수 받기
		int N = sc.nextInt();
		// 수열의 개수만큼 배열 채우기
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer(); // 값을 저장하기위해 사용
		int num = 1; // 오름차순하기위해 사용
		boolean result = true;
		for (int i = 0; i < A.length; i++) {
			int su = A[i]; // 수열의 있는값들을 차례대로 가져옴
			if (su >= num) { // 현재 오름차순 자연수보다 클 경우
				while (su >= num) { // 값이 같아질때까지 반복
					stack.push(num++); // push할때마다 num값은 1씩 증가
					bf.append("+\n"); // +출력과 동시에 줄바꿈 해줌
				}
				stack.pop();
				bf.append("-\n"); // stack.pop()을사용할때마다 -를 출력
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
