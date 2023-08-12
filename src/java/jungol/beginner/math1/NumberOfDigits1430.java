package java.jungol.beginner.math1;
// 1430 숫자의 개수

import java.util.Scanner;

public class NumberOfDigits1430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if((!(a>=100 && a<1000)) || (!(b>=100 && b<1000)) || (!(c>=100 && c<1000))) {
				
			} else break;
		}
		
		int num = a*b*c;

		String stringNum = Integer.toString(num);

		int[] array = new int[stringNum.length()];

		for(int i = 0; i < stringNum.length(); i++) {
				array[i] = Character.getNumericValue(stringNum.charAt(i));
				}

		for(int i = 0; i <= 9; i++) {
			int count = 0;
			for(int j = 0; j < stringNum.length(); j++) {
				if (array[j] == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}

// 1430 숫자의 개수
//
// 문제
// 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
//
// 입력 형식
// 첫째 줄에 A 둘째 줄에 B 셋째 줄에 C가 주어진다.
// A B C는 모두 100보다 같거나 크고 1 000보다 작은 자연수이다.
//
// 출력 형식
// 첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다.
// 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
//
// 입력 예
// 150
// 266
// 427
//
// 출력 예
// 3
// 1
// 0
// 2
// 0
// 0
// 0
// 2
// 0
// 0
