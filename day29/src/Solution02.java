import java.util.Random;

public class Solution02 {
    public static void main(String[] args) {
        try{
            System.out.println(throwRandom());
        } catch (Exception e){ //일반적인 에러, 익셉션 처리
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행");
        }
        System.out.println("도달?");
    }

    // static  ; instance를 만들지 않아도 클래스 단위에서 사용 가능
    static double throwRandom() { // 인스턴스를 만들지 않아도 클래스 단위에서 사용 가능
        Random random = new Random();
        double result = random.nextDouble(); // 0 포함 ~ 1 미포함 double
        try {
            if (result > 0.5) {
                int error = 10 / 0;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        } finally {
            if (result == -1) {
                result = 9999;
            } else {
                result *= 1_000_000;
            }
            return result;
        }
//        return result; // 여기 들어가는게 맞는데...
    }
}
