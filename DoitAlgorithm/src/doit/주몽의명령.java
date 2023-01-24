package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령 {

	public static void main(String[] args) throws IOException {
		// BufferedReader는 버퍼를 이용해서 읽고 쓰고 입력하는 함수이다.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //
		int N = Integer.parseInt(bf.readLine()); // BufferedReader사용할때 readLine을 사용하는데 데이터를 라인 단위로 읽을수 있다.
		int M = Integer.parseInt(bf.readLine());
		int[] A = new int[N];
		// StringTokenizer을 사용하여 특정 문자열을 나누고 싶을때 사용하며 nextToken()을이용하여 객체에 다음 토큰을 반환한다.
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int count = 0;
		int i = 0;
		int j = N - 1;
		
		while (i < j) {
			if (A[i] + A[j] < M) {
				i++;
			} else if (A[i] + A[j] > M) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		bf.close();
		
	}

}
