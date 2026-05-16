package collection.framework;
import java.util.*;


public class QueueDemo {
    public static void main(String[] args) {
 /*       Queue<Integer> queue = new LinkedList<>();
        queue.offer(23);
        queue.offer(34);
        queue.offer(67);
//        System.out.println(queue.poll());
        System.out.println(queue.peek());
//        System.out.println(queue);
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll());
        System.out.println(pq);*/
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(3);
        System.out.println(dq);
    }

}
