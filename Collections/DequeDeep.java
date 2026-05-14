import java.util.*;
public class DequeDeep {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");

        deque.addFirst("A");
        System.out.println(deque);

        System.out.println("First element: "+deque.peekFirst());
        System.out.println("Last element: "+deque.peekLast());
        System.out.println("Still: "+deque);

        System.out.println("Removed First: "+deque.removeFirst());
        System.out.println(deque);
        System.out.println("Removed Last: "+deque.removeLast());
        System.out.println(deque);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: "+ stack);
        System.out.println("popped: "+ stack.pop());
        System.out.println("Peek: "+stack.peek());

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(2);
        q.offer(3);
        System.out.println("Queue: "+q);
        System.out.println("Poll: "+q.poll());

        System.out.println("Size: "+q.size());
        System.out.println("Size: "+q.isEmpty());

    }
}
