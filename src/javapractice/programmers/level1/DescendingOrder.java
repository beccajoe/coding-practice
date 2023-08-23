package javapractice.programmers.level1;
// 정수 내림차순으로 배치하기

import java.util.Arrays;

public class DescendingOrder {
    public long solution(long n) {
        long answer;

        String s = Long.toString(n);
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = new char[arr1.length];
        int i = arr1.length - 1;

        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = arr1[i];
            i--;
        }

        answer = Long.parseLong(String.valueOf(arr2));
        return answer;
    }
}

// 정수 내림차순으로 배치하기
//
// 문제 설명
// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
// 제한 조건
// n은 1이상 8000000000 이하인 자연수입니다.
//
// 입출력 예
// n	return
// 118372	873211