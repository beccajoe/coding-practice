package javapractice.programmers.level0;

// 분수의 덧셈
public class FractionSum {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int currentNumerator = 0, currentDenominator = 0;
        if (denom1 == denom2){
            currentNumerator = numer1 + numer2;
            currentDenominator = denom1;
        } else if (denom1 > denom2 && denom1 % denom2 == 0){
            int lcd = denom1 / denom2;
            if (denom2 * lcd == denom1){
                currentNumerator = numer1 + (numer2 * lcd);
                currentDenominator = denom1;
            }
        } else if (denom2 > denom1 && denom2 % denom1 == 0){
            int lcd = denom2 / denom1;
            if (denom1 * lcd == denom2){
                currentNumerator = numer2 + (numer1 * lcd);
                currentDenominator = denom2;
            }
        } else {
            int lcm = lcm(denom1, denom2);

            currentNumerator = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
            currentDenominator = lcm;
        }

        int gcd = gcd(currentNumerator, currentDenominator);
        answer[0] = currentNumerator / gcd;
        answer[1] = currentDenominator / gcd;
        return answer;
    }
    private static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    private static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
// 분수의 덧셈
// 문제 설명
// 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//
// 제한사항
// 0 <numer1, denom1, numer2, denom2 < 1,000
//
// 입출력 예
// numer1	denom1	numer2	denom2	result
// 1	    2	    3	    4	    [5, 4]
// 9	    2	    1	    3	    [29, 6]
//
// 입출력 예 설명
// 입출력 예 #1
// 1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
//
// 입출력 예 #2
// 9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.