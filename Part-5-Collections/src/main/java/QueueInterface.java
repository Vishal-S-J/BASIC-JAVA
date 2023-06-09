import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

class PriorityQueueClass {
    public void methPrioityQueue() {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}

class ArrayDequeClass {
    public void methArrayDeque() {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");

        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

public class QueueInterface {
    public static void main(String[] args) {
        System.out.println("===================================================");
        PriorityQueueClass priorityQueue = new PriorityQueueClass();
        priorityQueue.methPrioityQueue();
        System.out.println("===================================================");
        ArrayDequeClass arrayDequeClass = new ArrayDequeClass();
        arrayDequeClass.methArrayDeque();
        System.out.println("===================================================");
    }
}
