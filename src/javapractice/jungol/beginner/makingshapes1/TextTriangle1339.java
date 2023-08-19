package javapractice.jungol.beginner.makingshapes1;
// 1339 문자삼각형2

import java.util.Scanner;
public class TextTriangle1339 {
	public static void main(String[] args) {
		int n = 0;
		char ch = 'A';
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(sc.hasNextInt()) {
				n = sc.nextInt(); 
				if((n == 0) || (n % 2 == 0) || (!(n >= 1 && n <= 100))) {
					System.out.println("INPUT ERROR");
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		int row = 0, column = 0;
		char[][] array = new char[n][n];
		if ((n!=0) && (n % 2 != 0) && (n >= 1 && n <= 100)) {
			for(row = 0; row < n; row++) {
				for(column = 0; column < n; column++) {
					array[row][column] = ' ';
				}
			}
			for(int loop = ((n-1)/2); loop >= 0; loop--) {
			for(column = loop, row = loop; row < n && row < n-column; row++) {
				array[row][column] = ch; 
				ch++;
				if(ch > 'Z') 
					ch = 'A';
			}
		}
			for(row = 0; row < n; row++) {
				for(column = 0; column < n; column++) {
					System.out.printf("%s ", array[row][column]);
				}
				System.out.println();
			}
		}
	}
}

// 1339 문자삼각형2
//
// 문제
// 삼각형의 높이 N을 입력받아서 아래와 같이 문자 'A'부터 차례대로 맨 오른쪽 가운데 행부터 차례대로 아래와 같이 채워서
// 삼각형 모양을 출력하는 프로그램을 작성하시오.
//
// < 처리조건 >
// (1) 오른쪽 가운데 행에 문자 'A'를 채우고 왼쪽 열로 이동하여 위에서 아래로 채워나간다.
// 2) 가장 왼쪽 행까지 반복하여 모두 채워 나간다. (문자 'Z'다음에는 'A'부터 다시 시작한다.)
//
// E
// F B
// G C A
// H D
// I
// n이 5일 경우
//
// 입력
// 삼각형의 높이 N(N의 범위는 1이상 100 이하의 홀수)을 입력받는다.
//
// 출력
// 주어진 형태대로 높이가 N인 문자삼각형을 출력한다. 문자 사이는 한 개의 공백으로 구분한다. 입력범위를 벗어나면 "INPUT ERROR"를 출력한다.
//
// 예제
// 입력
// 5
// 출력
// E
// F B
// G C A
// H D
// I
//
//힌트
// <생각하기>
//열 우선으로 작성하면 된다. 열 번호에 따른 행의 범위는 다음과 같다.
//
// 열 번호		행의 시작		행의 끝
//	3			3			3
//	2			2			4
//	1			1			5
//
// 열 번호를 i라 하면 시작위치는 i와 같고 끝위치는 n + 1 -  i 와 같다.