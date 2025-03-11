public class Solution05 {
    public static void main(String[] args) {
        // 재귀를 왜 알아야하죠?
        // DFS (아련...) 몇몇 상황에서는 Stack으로 안되는 경우 (백트래킹)
        // 재귀적 -> 나 자신을 아는 나 자신을 아는 나 자신을 아는 나 자신을...
        Fact f = new Fact();
        System.out.println(f.factorial(10));
        System.out.println(f.factorialByRecursion(10));
    }
}

class Fact {
    long factorial (int n){
        long answer =1;
        for (int i=n; i>1; i--){
            answer*=i;
        }
        return answer;
    }

    long factorialByRecursion (int n){
        if(n==1){
            return 1; // 종료 조건 필요, 반복 계열
        }
        return factorialByRecursion(n-1)*n;
    }

}
