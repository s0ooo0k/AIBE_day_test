import java.util.Arrays;

public class Solution03 {
    public static void main(String[] args) {
        // ========== 문자열 비교 =============
        String text1 = "안녕하세요";
        System.out.println("text1 = " + text1);
        String text2 = "안녕하세요";
        System.out.println("text2 = " + text2);
        boolean isEqual = text1 == text2; // ==을 하면 주소값을 비교
        System.out.println("isEqual = " + isEqual);
        //String text3 = new StringBuffer().append("안녕하세요").toString();
        String text3 = new String("안녕하세요"); // 캐싱을 막기 위해?
        // 기존에 없던 String의 객체를 강제로 메모
        System.out.println("text3 = " + text3);
        boolean isEqual2 = text1 == text3;
        System.out.println("isEqual2 = " + isEqual2);

        // 주소 확인
        System.out.println(System.identityHashCode(text1));
        System.out.println(System.identityHashCode(text2));
        System.out.println(System.identityHashCode(text3));
        // ==== 텍스트 비교할 땐 .. ====
        System.out.println(text1.equals(text3));


        // 2번 배열을 어떻게 만들까? 배열 어떻게 추가하지? => 뭔가 많이 잘못됨
        // 1) 배열은 객체입니다. (생성자로 만들어야 함. 혹은 그에 준하는 메서드 필요)
        // 2) 배열은 도일한 타입들의 나열입니다.
        // 3) 배열은 크기가 정해져 있으며 변할 수 없습니다.
            // -> 처음부터 값을 초기화해버리며 고정해버리거나, 빈 배열을 만들며 그 길이(혹은 다차원일 경우 모양)을 지정
        int[] numbers = new int[7];
        // 7개의 동일한 정수(소수점 없는) int 4바이트. 부호 여부 signed(-~+). unsigned(+만)
        // 2^32 -10^9~-10^9 20억~20억 => 40억
        // int overflow.
        // long 8바이트 -> 2^64 / -10^19 - 10^19 -> 이 버뮈가 넘어가면 uuid영역 => hashing영역 (오버플로우 거의 안남)
        // 3d 좌표와 객체를 다루는 게임의 경우 가끔 오버플로우가 남
        // 이럴 경우엔 대용량 처리로...

        int[] arr = {1, 2};
        System.out.println("arr = " + arr); // 출력 : arr = [I@58372a00

        int[][] arr1 = {{1, 2}}; // 이중 배열 // {} 중괄호로 초기화 안되는 것은 아님
        System.out.println("arr1 = " + arr1); // 출력 : arr1 = [[I@4dd8dc3

        int arr2[][] = {{1, 2}};
        System.out.println("arr2 = " + arr2); // 출력  arr2 = [[I@6d03e736

        // 배열은 객체이기 때문에, 어딘가에 담겨있고, 주소가 기본적으로 출력시 기본값
        // 문자열의 경우 사람들이 출력하다보니 그냥 텍스트의 묶음을 연결한 걸 출력하도록 정의
        // toString -> 오버라이딩. 모든 객체는 주소가 찍혀 나온다

        System.out.println("Arrays.deepToString(arr2) " + Arrays.deepToString(arr2));
        // 내용이 나온다.

        String[] fruits = {"Apple", "pear", "grapes"};

        for (int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }
        // 향상된 for문 | for (const v of arr) {} 같은 느낌
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        //iter

    }
}
