// 기본 주석
///  java doc

import javax.lang.model.SourceVersion;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

/** java doc 2 */
// /**...*/ 메서드, 클래스에 대한 설명을 java doc 을 통해 작성 가능
// 특수한 기능을 하는 주석
public class Solution01 {
    // main
    public static void main(String[] args) {
        System.out.println("Hello World");
        // 숫자 int (정수, 일반적, 20억 or 40억, 4바이트)
        
        int money = 0;
        System.out.println("money = " + money);
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextInt(); // 입력 받아 int로 변환 후 넣기
        System.out.println("money = " + money);

        // 숫자 long ( 정수 -> 아무 생각하고 싶지 않다 ( 한도에 대한 걱정 X))
        // String -> 문자열은 그 자체에 대한 길이 제한이 없는 것과 비슷 -> 진법과 종속되지 않음
        
        long bigMoney = 0;
        System.out.println("bigMoney = " + bigMoney);
        bigMoney = scanner.nextLong();
        System.out.println("bigMoney = " + bigMoney);

        // seq. 자동으로 1씩 증가하는 pk(primary key)에 사용
        // 다만 요즘엔 보안 이슈 등으로 인해 공개된 자원에 대해 시퀀설한 pk는 지양하는 분위기

        // double (소수, 부동소수점) 정밀도 15자리
        double dollar = 0.0;
        System.out.println("dollar = " + dollar);
        dollar = scanner.nextDouble();
        System.out.println("dollar = " + dollar);

        double dollar1, dollar2;
        dollar1 = scanner.nextDouble(); // 10.000
        dollar2 = scanner.nextDouble(); // 3.000
        double dollarSum = dollar1 + dollar2;
        System.out.println("dollar1 = " + dollar1);
        System.out.println("dollar2 = " + dollar2);
        // 부동소수점 이슈가 있음
        // 예시
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("0.1 + 0.2 == 0.3 is " + (sum == 0.3)); // false

        // BigDecimal 정확한
        BigDecimal exactDollar1 = scanner.nextBigDecimal();
        BigDecimal exactDollar2 = scanner.nextBigDecimal();
        BigDecimal dollarSum2 = exactDollar1.add(exactDollar2);
        System.out.println("0.1 + 0.2 = " + dollarSum2);
        System.out.println("0.1 + 0.2 == 0.3 is " + (dollarSum2.equals(new BigDecimal("0.3")))); // true

        // boolean (참 / 거짓)
        // String
        String guy1 = "chill guy";
        String guy2 = new String(guy1);
        System.out.println("guy1 = " + guy1);
        System.out.println("guy2 = " + guy2);
        System.out.println("guy1 == guy = " + (guy1==guy2));
        System.out.println("guy1.equals(guy2)= " + guy1.equals(guy2));

        // 배열 (객체 -> 생성 new, 타입, 갯수(길이)
        /* 객체임에도 내장 메서드가 없음
        -> 보통 index를 통한 수정만 함 (추가 삭제의 개념)
        -> 추후
         */
        int[] arr = new int [5];
        int[] arr2 = {1, 2, 3, 4, 5};
        int[][] matrix = {{1, 2}};
        int[][] matrix2 = new int[1][2];

        // 향상된 for문 -> fori, iter로 작성

    }
}
