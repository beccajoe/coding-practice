package java.jungol.beginner.makingshapes1;
// 1314 문자사각형2

import java.util.Scanner;
public class TextRectangle1314 {
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
			if(row % 2 == 0) {
				for(column = 0; column < n; column++) {
					array[column][row] = (char)ch;
					ch++;
					if(ch > 'Z') ch = 'A';
				}
				
			} else { 
				for(column = n-1; column >= 0; column--) {
					array[column][row] = (char)ch;
					ch++;
					if(ch > 'Z') ch = 'A';
				}
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

// 1314 문자사각형2
//
// 문제
// 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.
//
// < 처리조건 >
// 문자의 진행 순서는 왼쪽 위에서부터 아래쪽으로 ‘A'부터 차례대로 채워나가고
// 다시 오른쪽 아래부터 위쪽으로 채워나가는 방법으로 아래 표와 같이 채워 넣는다.
// 'Z' 다음에는 다시 'A'부터 반복된다.
//
// A H I P
// B G J O
// C F K N
// D E L M
// n이 4일 경우
//
// 입력
// 정사각형 한 변의 길이 n(n의 범위는 1이상 100 이하의 정수)을 입력받는다.
//
// 출력
// 위의 형식과 같이 한변의 길이가 n인 문자 사각형을 출력한다. 문자 사이는 공백으로 구분하여 출력한다.
//
// 예제
// 입력
// 4
// 출력
// A H I P
// B G J O
// C F K N
// D E L M
//
// 입력
// 18
// 출력
// A J K T U D E N O X Y H I R S B C L
// B I L S V C F M P W Z G J Q T A D K
// C H M R W B G L Q V A F K P U Z E J
// D G N Q X A H K R U B E L O V Y F I
// E F O P Y Z I J S T C D M N W X G H
// F E P O Z Y J I T S D C N M X W H G
// G D Q N A X K H U R E B O L Y V I F
// H C R M B W L G V Q F A P K Z U J E
// I B S L C V M F W P G Z Q J A T K D
// J A T K D U N E X O H Y R I B S L C
// K Z U J E T O D Y N I X S H C R M B
// L Y V I F S P C Z M J W T G D Q N A
// M X W H G R Q B A L K V U F E P O Z
// N W X G H Q R A B K L U V E F O P Y
// O V Y F I P S Z C J M T W D G N Q X
// P U Z E J O T Y D I N S X C H M R W
// Q T A D K N U X E H O R Y B I L S V
// R S B C L M V W F G P Q Z A J K T U