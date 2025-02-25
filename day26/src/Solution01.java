public class Solution01 {
    public static void main(String[] args) {
        // 문자열
        String hello = "hello";
        System.out.println("hello = " + hello);
        String newHello = new String(hello);
        System.out.println("newHello = " + newHello);
        System.out.println("hello == newHello = " + (hello == newHello)); // false
        System.out.println("System.identityHashCode(hello)= " +System.identityHashCode(hello));
        System.out.println("System.identityHashCode(newHello)= " +System.identityHashCode(newHello));
        // 문자열이 같은지 비교하려면
        System.out.println("hello.equals(newHello)= "+hello.equals(newHello));

        // StringBuffer
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
//            game += (i + 1) * 3;
//            System.out.println("game = " + game);
            sb.append((i + 1) * 3);
        }
        String result = sb.toString();
//        System.out.println("result = " + result);
        System.out.println("수행시간 : " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
//            game += (i + 1) * 3;
//            System.out.println("game = " + game);
            builder.append((i + 1) * 3);
        }
        String result2 = builder.toString(); // 조금 더 17에 뭔가 최적화;;;
//        System.out.println("result2 = " + result2);
        System.out.println("수행시간 : " + (System.currentTimeMillis() - startTime));
    }
}
