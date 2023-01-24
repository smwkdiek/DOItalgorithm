package doit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>(); // Queue를 선언
		int N = sc.nextInt();
		for(int i = 1; i <=N; i++) {	// 큐에 카드 저장
			myQueue.add(i);
		}
		while(myQueue.size() > 1) {	// 카드가 1장 남을 때까지 반복한다.
			myQueue.poll();	// 맨 위의 카드를 버림
			myQueue.add(myQueue.poll());	// 맨 위의 카드를 가장 아래의 카드 밑으로 이동
		}
		System.out.println(myQueue.poll());	// 남은 카드 출력
 	}
}
