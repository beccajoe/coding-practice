package javapractice.jungol.beginner.math1;
// 1692 곱셈

import java.util.Scanner;

public class Multiplication1692 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = 0, secondNum = 0;
		while(true) {
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
			if((!(firstNum>=100 && firstNum<=999)) || (!(secondNum>=100 && secondNum<=999))) {
				
			} else break;
		}

		String stringSecondNum = Integer.toString(secondNum);

		int firstDigit = Integer.parseInt(stringSecondNum.charAt(0) + "");
		int secondDigit = Integer.parseInt(stringSecondNum.charAt(1) + "");
		int thirdDigit = Integer.parseInt(stringSecondNum.charAt(2) + "");

		System.out.println(firstNum*thirdDigit);

		System.out.println(firstNum*secondDigit);

		System.out.println(firstNum*firstDigit); 

		System.out.println(firstNum*secondNum);
	}
}

// 1692 곱셈
//
// 문제
// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//
//    472 -1
//   x385 -2
//
//   2360 -3
//  3776  -4
// 1416   -5
//
// 181720 -6
//
// (1)과 (2)위치에 들어갈 세 자리 자연 수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
// 입력 형식
// 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
// 출력 형식
// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
//
// 입력 예
// 472
// 385
//
// 출력 예
// 2360
// 3776
// 1416
// 181720
