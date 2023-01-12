package doit;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		// 값을 입력하기위해 사용
		Scanner sc = new Scanner(System.in);
		// N값 입력
		int N = sc.nextInt();
		// 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장
		String sNum = sc.next();
		// sNum을 다시 char[]형 변수 cNum에 변환하여 저장
		char[] cNum = sNum.toCharArray();
		// int형 변수 sum 선언 초기화 하기위해 0으로 해준다.
		int sum = 0;
		
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0'; // cNum안에 char값이 빠져나가며 아스키코드를 사용하여 cNum에있는 문자열을 정수형으로 바꿔주기위해 "0"이나 48을 사용한다.
		}
		System.out.println(sum);
	}
}
