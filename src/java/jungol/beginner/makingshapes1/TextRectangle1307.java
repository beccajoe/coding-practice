package java.jungol.beginner.makingshapes1;
// 1307 문자사각형1

import java.util.Scanner;
public class TextRectangle1307 {
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
		int column, row;
		char[][] array = new char[n][n];
		for(row = 0; row < n; row++) {
			for(column = 0; column < n; column++) {
				if(ch > 'Z') ch = 'A';
				array[n-(column+1)][n-(row+1)] = (char)ch;
				ch++;
			}	
		}
		for(column = 0; column < n; column++) {
			for(row = 0; row < n; row++) {
				System.out.printf("%c ", array[column][row]);
			}
			System.out.println();
		}
	}
}

// 1307 문자사각형1
//
// 문제
// 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.
//
//	[ 처리조건 ]
//	문자의 진행 순서는 맨 오른쪽 아래에서 위쪽으로 'A'부터 차례대로 채워나가는 방법으로 아래 표와 같이 왼쪽 위까지 채워 넣는다.
//	'Z' 다음에는 다시 'A'부터 반복된다.
//
//	P L H D
//	O K G C
//	N J F B
//	M I E A
//	n이 4일 경우
//
//	입력
//	정사각형 한 변의 길이 n(n의 범위는 1이상 100 이하의 정수)을 입력받는다.
//
//	출력
//	위의 형식과 같이 한변의 길이가 n인 문자 사각형을 출력한다.
//	문자 사이는 공백으로 구분하여 출력한다.
//
//	예제
//	입력
//	4
//	출력
//		P L H D
//		O K G C
//		N J F B
//		M I E A
//
//	힌트
// <생각하기>
// 열을 우선으로 하여 바깥 for문을 작성하되 행과 열 모두 n부터 1까지로 순서를 정해서 채워나가면 된다.
// 채워야 할 배열은 정수가 아닌 문자배열로 선언하고 int num = 1; 대신 char ch = 'A'; 와 같이 문자로 선언하고 초기화 해서 처리하면 된다.
//
//
