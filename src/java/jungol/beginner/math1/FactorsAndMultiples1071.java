package java.jungol.beginner.math1;
// 1071 약수와 배수

import java.util.Scanner;

public class FactorsAndMultiples1071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, m = 0;
		while(true) {
			n = sc.nextInt();
			if((!(n>=1 && n<40))){
				 
			} else break;
		}
		int[] array = new int[n];
		sc.nextLine();
		String line = sc.nextLine();
	    String[] tokens = line.split(" ");
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(tokens[i]);
			array[i] = num;
		}

		while(true) {
			m = sc.nextInt();
			if((!(m>=1 && m<100))){
				
			} else break;
		}
		int fsum = 0;
		for(int i = 0; i < n; i++) {
			int ftemp = array[i];
			if (ftemp != 0 && m % ftemp == 0) {
				fsum += ftemp;
			}
		}

		System.out.println(fsum);
		
		int msum = 0;
		for(int i = 0; i < n; i++) {
			int mtemp = array[i];
				if (mtemp != 0 && mtemp % m == 0) {
					msum += mtemp;
				}
		}

		System.out.println(msum);
	}
}

// 1071 약수와 배수
//
// 문제
// 주어진 정수들 중 입력 받은 수의 약수와 배수의 합을 각각 출력하라.
// 예를 들면,
// 6개의 정수 2, 3, 5, 12, 18, 24 가 주어지고 12를 입력 받은 경우
// 12의 약수는 2, 3, 12 이고
// 12의 배수는 12, 24 이다.
//
// 입력형식
// 첫 줄에 정수의 개수 n (1<= n <=40)을 입력 받는다.
// 둘째 줄에는 n개의 정수를 한 줄에 입력 받는다.
// 셋째 줄에는 약수와 배수를 구할 정수 m(1<=m<=100)을 입력 받는다.
//
// 출력형식
// 첫 줄에는 정수 m의 약수의 합을 둘째 줄에는 정수 m의 배수의 합을 출력한다.
//
// 입력 예
// 6
// 2 3 5 12 18 24
// 12
//
// 출력 예
// 17
// 36