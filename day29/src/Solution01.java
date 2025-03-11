import java.util.Random;

public class Solution01 {
    public static void main(String[] args) {

        try{
            int num = 10;
            System.out.println(10/0);
        } catch (Exception e){ //일반적인 에러, 익셉션 처리
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행");
        }
        System.out.println("도달?");
        /* 출력
        java.lang.ArithmeticException: / by zero
	    at Solution01.main(Solution01.java:6)
        도달? */
    }

}
