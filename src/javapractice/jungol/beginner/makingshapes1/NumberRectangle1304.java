package javapractice.jungol.beginner.makingshapes1;
// 1304 숫자사각형3

import java.util.Scanner;

public class NumberRectangle1304 {
	public static void main(String[] args) {
		int n = 0;
		int number = 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			if((!(n >= 1 && n <= 100))){
				System.out.println("INPUT ERROR!");
			} else break;
		}
		int column, row;
		int[][] array = new int[n][n];
		for(column = 0; column < n; column++) {
			for(row = 0; row < n; row++) {
				array[column][row] = number++;
			}
		}
		for(row = 0; row < n; row++) {
			for(column = 0; column < n; column++) {
				System.out.printf("%d ", array[column][row]);
			}
			System.out.println();
		}	
	}
}

// 1304 숫자사각형3
//
// 문제
// 정사각형의 한 변의 길이 n을 입력 받은 후 다음과 같이 숫자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.
// < 처리조건 >
// 숫자의 진행 순서는 처음에 왼쪽 위에서 아래쪽으로 n만큼 진행 한 후
// 바로 오른쪽 위에서 다시 아래쪽으로 진행하는 방법으로 정사각형이 될 때까지 반복한다.
//
// 입력형식
// 정사각형 한 변의 길이 n(n의 범위는 100 이하의 자연수)을 입력받는다.
//
// 출력형식
// 위의 형식과 같이 한 변의 길이가 n인 숫자 사각형을 출력한다. 숫자 사이는 공백으로 구분하여 출력한다.
//
// 입력 예
// 4
//
// 출력 예
// 1 5 9 13
// 2 6 10 14
// 3 7 11 15
// 4 8 12 16
