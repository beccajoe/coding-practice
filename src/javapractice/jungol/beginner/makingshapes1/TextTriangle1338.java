package javapractice.jungol.beginner.makingshapes1;
// 1338 문자삼각형1

import java.util.Scanner;

public class TextTriangle1338 {
	public static void main(String[] args) {
		int n = 0;
		char ch = 'A';
		Scanner sc = new Scanner(System.in);
		while(true) {
			 n = sc.nextInt();
			if((!(n >= 1 && n <= 100))) {
				System.out.println("INPUT ERROR!");
			} else break;
		}
		int column, row = 0;
		char[][] array = new char[n][n];
		for(column = 0; column < n; column++) {
			for(row = 0; row < n; row++) {
				array[column][row] = ' ';
			}
		}
		for(int loop = 0; loop < n; loop++) {
			for(column = loop, row = n-1; column < n && row >= loop; column++, row--) {
				array[column][row] = ch;  
				ch++;
				if(ch > 'Z') ch = 'A';
			} 
		}
		
		for(column = 0; column < n; column++) {
			for(row = 0; row < n; row++) {
				System.out.printf("%s ", array[column][row]);
			}
			System.out.println();
		}
	}
}

//1338 문자삼각형1
//
// 문제
// 삼각형의 높이 N을 입력받아서 아래와 같이 문자 'A'부터 차례대로 왼쪽 대각선으로 채워서 삼각형 모양을 출력하는 프로그램을 작성하시오.
//
// < 처리조건 >
// (1) 오른쪽 위부터 왼쪽 아래쪽으로 이동하면서 문자 'A'부터 차례대로 채워나간다.
// (2) N번 행까지 채워지면 다시 오른쪽 둘째 행부터 왼쪽 아래로 채워나간다.
// (3) 삼각형이 모두 채워질 때까지 반복하면서 채워 나간다. (문자 'Z'다음에는 'A'부터 다시 시작한다.)
//
// 입력형식
// 삼각형의 높이 N(N의 범위는 100 이하의 양의 정수)을 입력받는다.
//
// 출력형식
// 주어진 형태대로 높이가 N인 문자삼각형을 출력한다. 문자 사이는 한 개의 공백으로 구분한다.
//
// 입력 예
// 5
//
// 출력 예
//         A
//       B F
//     C G J
//   D H K M
// E I L N O