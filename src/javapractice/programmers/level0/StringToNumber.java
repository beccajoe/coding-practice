package javapractice.programmers.level0;

// 영어가 싫어요
public class StringToNumber {
    public long solution(String numbers) {
        StringBuilder currentNum = new StringBuilder();
        StringBuilder answerBuilder = new StringBuilder();
        for (char c : numbers.toCharArray()){
            currentNum.append(c);
            String currentNumString = currentNum.toString();
            if (currentNumString.equals("zero")){
                answerBuilder.append(0);
                currentNum.setLength(0);
            } else if (currentNumString.equals("one")){
                answerBuilder.append(1);
                currentNum.setLength(0);
            } else if (currentNumString.equals("two")){
                answerBuilder.append(2);
                currentNum.setLength(0);
            } else if (currentNumString.equals("three")){
                answerBuilder.append(3);
                currentNum.setLength(0);
            } else if (currentNumString.equals("four")){
                answerBuilder.append(4);
                currentNum.setLength(0);
            } else if (currentNumString.equals("five")){
                answerBuilder.append(5);
                currentNum.setLength(0);
            } else if (currentNumString.equals("six")){
                answerBuilder.append(6);
                currentNum.setLength(0);
            } else if (currentNumString.equals("seven")){
                answerBuilder.append(7);
                currentNum.setLength(0);
            } else if (currentNumString.equals("eight")){
                answerBuilder.append(8);
                currentNum.setLength(0);
            } else if (currentNumString.equals("nine")){
                answerBuilder.append(9);
                currentNum.setLength(0);
            }
        }
        long answer = Long.parseLong(answerBuilder.toString());
        return answer;
    }
}
// 영어가 싫어요
// 문제 설명
// 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
//
// 제한사항
// numbers는 소문자로만 구성되어 있습니다.
// numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
// 1 ≤ numbers의 길이 ≤ 50
// "zero"는 numbers의 맨 앞에 올 수 없습니다.
//
// 입출력 예
// numbers	                                result
// "onetwothreefourfivesixseveneightnine"	123456789
// "onefourzerosixseven"	                14067
//
// 입출력 예 설명
// 입출력 예 #1
// "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.
//
// 입출력 예 #1
// "onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.