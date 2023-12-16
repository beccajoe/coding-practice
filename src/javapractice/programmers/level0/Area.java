package javapractice.programmers.level0;
// 직사각형 넓이 구하기
public class Area {
    public int solution(int[][] dots) {
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];
        int length1, length2;
        int xpoint1 = 0, xpoint2 = 0, ypoint1 = 0, ypoint2 = 0;
        if (x1 != x2){
            xpoint1 = x1;
            xpoint2 = x2;
        } else if (x1 != x3){
            xpoint1 = x1;
            xpoint2 = x3;
        }
        if (y1 != y2){
            ypoint1 = y1;
            ypoint2 = y2;
        } else if (y1 != y3){
            ypoint1 = y1;
            ypoint2 = y3;
        }
        if (xpoint1 >= 0 && xpoint2 >= 0){
            length1 = Math.abs(xpoint1 - xpoint2);
        } else if (xpoint1 < 0 && xpoint2 < 0){
            length1 = Math.abs(xpoint1 - xpoint2);
        } else {
            length1 = Math.abs(xpoint1) + Math.abs(xpoint2);
        }

        if (ypoint1 >= 0 && ypoint2 >= 0){
            length2 = Math.abs(ypoint1 - ypoint2);
        } else if (ypoint1 < 0 && ypoint2 < 0){
            length2 = Math.abs(ypoint1 - ypoint2);
        } else {
            length2 = Math.abs(ypoint1) + Math.abs(ypoint2);
        }
        int answer = length1 * length2;
        return answer;
    }
}
// 직사각형 넓이 구하기
// 문제 설명
// 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
//
// 제한사항
// dots의 길이 = 4
// dots의 원소의 길이 = 2
// -256 < dots[i]의 원소 < 256
// 잘못된 입력은 주어지지 않습니다.
//
// 입출력 예
// dots	                                result
// [[1, 1], [2, 1], [2, 2], [1, 2]]	    1
// [[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
//
// 입출력 예 설명
// 입출력 예 #1
// 좌표 [[1, 1], [2, 1], [2, 2], [1, 2]] 를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 1, 1이므로 직사각형의 넓이는 1 x 1 = 1입니다.
//
// 입출력 예 #2
// 좌표 [[-1, -1], [1, 1], [1, -1], [-1, 1]]를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 2, 2이므로 직사각형의 넓이는 2 x 2 = 4입니다.