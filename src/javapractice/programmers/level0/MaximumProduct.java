package javapractice.programmers.level0;
// 최댓값 만들기 (1)

import java.util.Arrays;
public class MaximumProduct {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = (numbers[numbers.length - 1]) * (numbers[numbers.length - 2]);
        return answer;
    }
}

// 최댓값 만들기 (1)
//
// 제한사항
// 0 ≤ numbers의 원소 ≤ 10,000
// 2 ≤ numbers의 길이 ≤ 100
//
// 입출력 예
// numbers	                result
// [1, 2, 3, 4, 5]	        20
// [0, 31, 24, 10, 1, 9]	744
//
// 입출력 예 설명
// 입출력 예 #1
// 두 수의 곱중 최댓값은 4 * 5 = 20 입니다.
//
// 입출력 예 #1
// 두 수의 곱중 최댓값은 31 * 24 = 744 입니다.