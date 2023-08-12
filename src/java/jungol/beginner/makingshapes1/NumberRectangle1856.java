package java.jungol.beginner.makingshapes1;
// 1856 숫자사각형2

import java.util.Scanner;

public class NumberRectangle1856 {
	public static void main(String[] args) {
		int n = 0, m = 0;
		int number = 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if((!(n >= 1 && n <= 100)) || (!(m >= 1 && m <= 100))) {
				System.out.println("INPUT ERROR!");
			} else break;
		}
		int column, row;
		int [][] array = new int[n][m];
		for(column = 0; column < n; column++) {
			if(column % 2 == 0) { 
				for(row = 0; row < m; row++) { 
					array[column][row] = number++;
				}
			} else { 
				for(row = m-1; row >= 0; row--) { 
					array[column][row] = number++;
				}
			}
		}
		for(column = 0; column < n; column++) {
			for(row = 0; row < m; row++) {
				System.out.printf("%d ", array[column][row]);
			}
			System.out.println();
		}
	}
}

// 1856 숫자사각형2
//
// 문제
// 사각형의 높이 n과 너비 m을 입력받은 후
// 사각형 내부에 지그재그 형태로 1부터 n*m번까지 숫자가 차례대로 출력되는 프로그램을 작성하시오.
// < 처리조건 >
// 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 m만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.
//
// 입력형식
// 사각형의 높이n와 너비m( n과 m의 범위는 100 이하의 정수)을 입력받는다.
//
// 출력형식
// 위에서 형태의 직사각형을 입력에서 들어온 높이 n과 너비 m에 맞춰서 출력한다. 숫자 사이는 공백으로 구분한다.
//
// 입력 예
// 4 5
//
// 출력 예
// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
