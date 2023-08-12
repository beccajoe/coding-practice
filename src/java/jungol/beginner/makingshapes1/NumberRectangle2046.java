package java.jungol.beginner.makingshapes1;
// 2046 숫자사격형4

import java.util.Scanner;

public class NumberRectangle2046 {
	public static void main(String[] args) {
		int n = 0, m = 0;
		int number = 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			 n = sc.nextInt();
			m = sc.nextInt();
			if((!(n >= 1 && n <= 100)) || (!(m >= 1 && m <= 3))) {
				System.out.println("INPUT ERROR!");
			} else break;
		}
		int column, row;
		int[][] array = new int[n][n];
		switch(m) {
		case 1: 
			for(column = 0; column < n; column++) {
				for(row = 0; row < n; row++) {
					array[column][row] = number;
				}
				number++;
			} 
			break;
		case 2: 
			for(column = 0; column < n; column++) {
				for(row = 0; row < n; row++){
					if(column % 2 == 0){
						array[column][row] = (row+1);
					} else {
						array[column][row] = (n-row);
					}
				}
			}
			break;
		case 3: 
			for(column = 0; column < n; column++) {
				for(row = 0; row < n; row++) {
					array[column][row] = (column+1) * (row+1);
				}
			}
			break;
		}
		for(column = 0; column < n; column++) {
			for(row = 0; row < n; row++) {
				System.out.printf("%d ", array[column][row]);
			}
			System.out.println();
		}
	}
}

// 2046 숫자사격형4
//
// 문제
// 정사각형의 한 변의 길이 n과 종류 m을 입력받은 후 다음과 같은 정사각형 형태로 출력하는 프로그램을 작성하시오.
// < 처리조건 >
// 종류 2번의 경우 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 n만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.
//
// 종류 1
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5
//
// 종류 2
// 1 2 3 4 5
// 5 4 3 2 1
// 1 2 3 4 5
// 5 4 3 2 1
// 1 2 3 4 5
//
// 종류 3
// 1 2 3 4 5
// 2 4 6 8 10
// 3 6 9 12 15x
// 4 8 12 16 20
// 5 10 15 20 25
//
// 입력형식
// 정사각형 한 변의 길이 n(n의 범위는 100 이하의 정수)과 종류 m(m은 1부터 3사이의 정수)을 입력받는다.
//
// 출력형식
// 위에서 언급한 3가지 종류를 입력에서 한 변의 길이 n과 종류 m에 맞춰서 출력한다. 숫자 사이는 공백으로 구분하여 출력한다.
//
// 입력 예
// 3 2
//
// 출력 예
// 1 2 3
// 3 2 1
// 1 2 3
//
// 입력 예
// 4 3
//
// 출력 예
// 1 2 3 4
// 2 4 6 8
// 3 6 9 12
// 4 8 12 16
