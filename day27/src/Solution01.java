import java.util.*;

public class Solution01 {
    public static void main(String[] args) {
        // 스택 = 쌓는다
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());

        stack.push(4);
        stack.push(5);

        while(!stack.isEmpty()) {
            System.out.println("stack.pop() = " + stack.pop());
            // 출력 5 4 2 1
        }


        // 큐
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        while(!queue.isEmpty()){
            System.out.println("queue.poll() = " + queue.poll());
            // 출력 1 2 3 4
        }


        // deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1); // -
        deque.push(2);
        deque.offer(3);
        deque.offer(4);
        while (!deque.isEmpty()){
            System.out.println("deque.pop() = " + deque.pop());
            System.out.println("deque.poll() = " + deque.poll());
        }
        


    }
}
