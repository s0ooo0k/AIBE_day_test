import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
//        주석은 단축키 동일
//        String Manipulation > Switch Case
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력");
        String name = scanner.nextLine(); // 지금 입력한 값을 받고 다음 줄로 넘어감
        // 입력이 얼어남
        System.out.println("안녕하세요 "+name);
        scanner.close();

    }
}
