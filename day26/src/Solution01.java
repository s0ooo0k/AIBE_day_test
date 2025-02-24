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
    }
}
