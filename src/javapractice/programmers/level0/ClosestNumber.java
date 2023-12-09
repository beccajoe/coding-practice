package javapractice.programmers.level0;

import java.util.HashMap;
import java.util.Map;

// 가까운 수
public class ClosestNumber {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> difference = new HashMap<>();
        for (int i : array){
            int currentDifference;
            if (i < n){
                currentDifference = n - i;
            } else if (i > n){
                currentDifference = i - n;
            } else {
                currentDifference = 0;
            }
            difference.put(i, currentDifference);
        }

        int minDifference = -1, answer = 0;

        for (Map.Entry<Integer, Integer> entry : difference.entrySet()){
            int currentNumber = entry.getKey();
            int currentDiff = entry.getValue();

            if (minDifference == -1){
                minDifference = currentDiff;
                answer = currentNumber;
            } else if (minDifference > currentDiff){
                minDifference = currentDiff;
                answer = currentNumber;
            } else if (minDifference == currentDiff){
                if (currentNumber < answer){
                    answer = currentNumber;
                }
            }
        }
        return answer;
    }
}
// 가까운 수
// 문제 설명
// 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
//
// 제한사항
// 1 ≤ array의 길이 ≤ 100
// 1 ≤ array의 원소 ≤ 100
// 1 ≤ n ≤ 100
// 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
//
// 입출력 예
// array	    n	result
// [3, 10, 28]	20	28
// [10, 11, 12]	13	12
//
// 입출력 예 설명
// 입출력 예 #1
// 3, 10, 28 중 20과 가장 가까운 수는 28입니다.
//
// 입출력 예 #2
// 10, 11, 12 중 13과 가장 가까운 수는 12입니다.
//※ 공지 - 2023년 3월 29일 테스트 케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.